/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import byui.cit260.fireswamp.Location;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryahh
 */
public class MapControllerTest {
    
    public MapControllerTest() {
    }
    
    /**
     * Test of checkMoveNorth method, of class MapController.
     */
    @Test
    public void testCheckMoveNorth() {
        System.out.println("checkMoveNorth");
        Location location = new Location();
        MapController instance = new MapController();
        boolean expResult = true;
        location.setRow(4);
        boolean result = instance.checkMoveNorth(location);
        assertEquals(expResult, result);
        
        expResult = false;
        location.setRow(0);
        result = instance.checkMoveNorth(location);
        assertEquals(expResult, result);
    }
    
}
