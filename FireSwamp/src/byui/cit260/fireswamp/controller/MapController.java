/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import byui.cit260.fireswamp.Location;

/**
 *
 * @author ryahh
 */
public class MapController {
    
    public boolean checkMoveNorth(Location location){
            if (location.getRow()== 0){
                return false;
            }
            return true;
        
    }
    
}