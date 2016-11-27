/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import byui.cit260.fireswamp.Location;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blvd
 */
public class MapControllerTest {
    
    public MapControllerTest() {
    }

    /**
     * Test of checkMove method, of class MapController.
     */
    @Test
    public void testCheckMove() {
        System.out.println("checkMove");
        int row = 3;
        int col = 2;
        MapController instance = new MapController();
        boolean expResult = true;
        boolean result = instance.checkMove(row, col);
        assertEquals(expResult, result);
    }


    
    
}
