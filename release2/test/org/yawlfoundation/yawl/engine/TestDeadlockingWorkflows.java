/*
 * This file is made available under the terms of the LGPL licence.
 * This licence can be retrieved from http://www.gnu.org/copyleft/lesser.html.
 * The source remains the property of the YAWL Foundation.  The YAWL Foundation is a collaboration of
 * individuals and organisations who are committed to improving workflow technology.
 *
 */


package org.yawlfoundation.yawl.engine;

import org.yawlfoundation.yawl.elements.YSpecification;
import org.yawlfoundation.yawl.elements.state.YIdentifier;
import org.yawlfoundation.yawl.unmarshal.YMarshal;
import org.yawlfoundation.yawl.exceptions.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.jdom.JDOMException;

/**
 /**
 * 
 * @author Lachlan Aldred
 * Date: 3/03/2004
 * Time: 12:08:48
 * 
 */
public class TestDeadlockingWorkflows extends TestCase{
    private YIdentifier _idForTopNet;

    public TestDeadlockingWorkflows(String s) {
        super(s);
    }


    public void setUp(){

    }


    public void testDeadlockingSpecification()
            throws YSchemaBuildingException, YSyntaxException,
            JDOMException, IOException, YStateException, YPersistenceException, YEngineStateException, YQueryException, YDataStateException {
        URL fileURL = getClass().getResource("DeadlockingSpecification.xml");
        File yawlXMLFile = new File(fileURL.getFile());
        YSpecification specification = null;
        specification = (YSpecification) YMarshal.
                        unmarshalSpecifications(yawlXMLFile.getAbsolutePath()).get(0);

        YEngine engine = YEngine.getInstance();
        EngineClearer.clear(engine);
        engine.loadSpecification(specification);
        _idForTopNet = engine.startCase(null, null, specification.getID(), null, null);
        YWorkItemRepository repository = YWorkItemRepository.getInstance();
        YNetRunner runner = repository.getNetRunner(_idForTopNet);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set items = repository.getWorkItems();
        assertTrue(items.size() == 1);
        for (Iterator iterator = items.iterator(); iterator.hasNext();) {
            YWorkItem item = (YWorkItem) iterator.next();
            assertTrue(item.getStatus() == YWorkItemStatus.statusDeadlocked);
//System.out.println("TestDeadlockingWorkflows::..." + item.toXML());
        }
        assertTrue(runner.isCompleted());
        assertFalse(runner.isAlive());
    }



    public static void main(String args[]){
        TestRunner runner = new TestRunner();
        runner.doRun(suite());
        System.exit(0);
    }
    public static Test suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestDeadlockingWorkflows.class);
        return suite;
    }
}