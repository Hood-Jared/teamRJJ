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
     * Test of checkMoveNorth method, of class MapController.
     */
    @Test
    public void testCheckMoveNorth() {
        System.out.println("checkMoveNorth");
        Location location = new Location();
        
        MapController instance = new MapController();
        instance.checkMoveNorth(location);
    }

    
    
}
