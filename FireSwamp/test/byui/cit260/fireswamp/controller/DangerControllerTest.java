/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryahh
 */
public class DangerControllerTest {
    
    public DangerControllerTest() {
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
    
}
