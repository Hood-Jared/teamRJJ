/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import FireSwamp.FireSwamp;
import byui.cit260.fireswamp.Location;
import byui.cit260.fireswamp.Map;
import byui.cit260.fireswamp.Player;

/**
 *
 * @author ryahh
 */
public class MoveController {
    
    public boolean moveNorth(){
        
        Player player = FireSwamp.getCurrentGame().getPlayer();
        Location currentLocation = player.getLocation();
        Map map = FireSwamp.getCurrentGame().getMap();
        
        if(currentLocation.getRow() == 5){
            return false;
        }
        
        player.setLocation(map.getLocationAt(currentLocation.getRow(), currentLocation.getCol() - 1));
        return true;
    }

    public boolean moveSouth() {
        
         Player player = FireSwamp.getCurrentGame().getPlayer();
        Location currentLocation = player.getLocation();
        Map map = FireSwamp.getCurrentGame().getMap();
        
        if(currentLocation.getRow() == 5){
            return false;
        }
        
        player.setLocation(map.getLocationAt(currentLocation.getRow(), currentLocation.getCol() - 1));
        return true;
    }


    public boolean moveWest() {
        
        Player player = FireSwamp.getCurrentGame().getPlayer();
        Location currentLocation = player.getLocation();
        Map map = FireSwamp.getCurrentGame().getMap();
        
        if(currentLocation.getRow() == 5){
            return false;
        }
        
        player.setLocation(map.getLocationAt(currentLocation.getRow(), currentLocation.getCol() - 1));
        return true;
    }


    public boolean moveEast() {
        
     Player player = FireSwamp.getCurrentGame().getPlayer();
        Location currentLocation = player.getLocation();
        Map map = FireSwamp.getCurrentGame().getMap();
        
        if(currentLocation.getRow() == 5){
            return false;
        }
        
        player.setLocation(map.getLocationAt(currentLocation.getRow(), currentLocation.getCol() - 1));
        return true;
    }

      
}
