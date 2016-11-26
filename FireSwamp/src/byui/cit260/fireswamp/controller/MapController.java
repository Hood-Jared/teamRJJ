/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import byui.cit260.fireswamp.Location;
import exceptions.MapControllerException;

/**
 *
 * @author ryahh
 */
public class MapController {

    public MapController() {      
    
    }
        
    
    public void checkMoveNorth(int row) throws MapControllerException {
        
        try {
            if (row < 0){
                throw new MapControllerException();
            }
        } catch (MapControllerException mce){
            System.out.println(mce.getMessage());
        } 
    }
    
    public void checkMoveEast(int row) throws MapControllerException {
       try {
            if (row < 0){
                throw new MapControllerException();
            }
        } catch (MapControllerException mce){
            System.out.println(mce.getMessage());
        }     
    }
    
    public void checkMoveSouth(int row) throws MapControllerException {
            try {
            if (row < 0){
                throw new MapControllerException();
            }
        } catch (MapControllerException mce){
            System.out.println(mce.getMessage());
        } 
    }
    
    public void checkMoveWest(int row) throws MapControllerException {
            try {
            if (row < 0){
                throw new MapControllerException();
            }
        } catch (MapControllerException mce){
            System.out.println(mce.getMessage());
        } 
    }
    
    public void doAction(String input) {{
            
        if (input == "W") {
            
        }
        else if (input == "A") {
            
        }
        else if (input == "S") {
            
        }
        else if (input == "D") {
            
        }
    }
    }
    
}
