/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author ryahh
 */
public class DangerControllerTest {
    
    public DangerControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of calcLightingSand method, of class DangerController.
     */
    @Test
    public void testCalcLightingSand() {
        System.out.println("calcLightingSand");
        double diameter = 0.0;
        DangerController instance = new DangerController();
        double expResult = -1;
        double result = instance.calcLightingSand(diameter);
        assertEquals(expResult, result, 0.1);
        
        diameter = 2;
        expResult = 3.14;
        result = instance.calcLightingSand(diameter);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of CalcFireSpouts method, of class DangerController.
     */
    @Test
    public void testCalcFireSpouts() {
        System.out.println("CalcFireSpouts");
        double triangleArea = 0.0;
        DangerController instance = new DangerController();
        double expResult = 0.0;
        double result = instance.CalcFireSpouts(triangleArea);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of calcRous method, of class DangerController.
     */
    @Test
    public void testCalcRous() {
        System.out.println("calcRous");
        double nextNumber = 0.0;
        double lastNumber = 0.0;
        DangerController instance = new DangerController();
        double expResult = 0.0;
        double result = instance.calcRous(nextNumber, lastNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
