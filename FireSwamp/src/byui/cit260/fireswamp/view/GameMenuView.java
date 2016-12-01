/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import FireSwamp.FireSwamp;
import byui.cit260.fireswamp.LocationType;
import byui.cit260.fireswamp.Map;
import byui.cit260.fireswamp.controller.MapController;
import byui.cit260.fireswamp.exceptions.*;
import byui.cit260.fireswamp.Location;
import byui.cit260.fireswamp.Game;


/**
 *
 * @author blvd
 */
public class GameMenuView extends View {
    
    Map map = FireSwamp.getCurrentGame().getGameMap();
    Location playerLocation = FireSwamp.getCurrentGame().getGameMap().getPlayerLocation();
    MapController mc = new MapController();
    
    public GameMenuView() {
        super("\nGame Menu"
            + "\nW - Move North"
            + "\nS - Move South"
            + "\nA - Move West"
            + "\nD - Move East"
            + "\nV - View Map"
            + "\nL - Look"
            + "\nT - Listen"
            + "\nB - Smell"    
            + "\nI - Check Inventory"
            + "\nE - Take Item"
            + "\nH - Help Menu"
            + "\nG - Save Game"
            + "\nQ - Quit to main menu");

    }

    @Override
    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);
        MapController mc = new MapController();
        

        switch (charSel) {
            case 'W':
                if(this.isValidMove(playerLocation.getLocationRow() - 1, playerLocation.getLocationColumn()) == true) {
                    this.movePlayer(-1, 0);
                }
                break;
            case 'S':
                if(this.isValidMove(playerLocation.getLocationRow() + 1, playerLocation.getLocationColumn()) == true) {
                    this.movePlayer(1, 0);
                }          
                break;
            case 'A':
                if(this.isValidMove(playerLocation.getLocationRow(), playerLocation.getLocationColumn() - 1) == true) {
                    this.movePlayer(0, -1);
                }
                break;
            case 'D':
                if(this.isValidMove(playerLocation.getLocationRow(), playerLocation.getLocationColumn() + 1) == true) {
                    this.movePlayer(0, 1);
                }
                break;
            case 'V':
                this.displayMap();
                break;
            case 'L':
                //Insert reference to Look Method()
                break;
            case 'T':
                //Insert reference to Listen Method()
                break;
            case 'B':
                //Insert reference to Smell Method()
                break;
            case 'I':
                //Insert reference to Check Inventory Method()
                break;
            case 'E':
                //Insert reference to Take Item Method()
                break;
            case 'H':
                //HelpMenuView hmv = new HelpMenuView();
                //hmv.display();
                break;
            case 'G':
                //Insert reference to Save Game Method();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }
    
    //Check to see if an exception should be thrown on the map movement
    private boolean isValidMove(int row, int col) {
        try {
                if (mc.checkMove(row, col) == false){
                    throw new MapControllerException("That will move you off the map, please try again!");
                }
                } catch(MapControllerException mce) {
                        ErrorView.display("GameMenuView", mce.getResponse());
                        return false;
                }
        return true;
            }
    
    //Moves the player according to the direction they choose
    private void movePlayer(int row, int col) {
        Map map = FireSwamp.getCurrentGame().getGameMap();
        Location[][] location = map.getMatrix();
        //Location[][] dangerLocations = map.getMatrix();
        
        //Assign moved location a variable
        row = playerLocation.getLocationRow() + row;
        col = playerLocation.getLocationColumn() + col;
        
        //Save & set the previous danger
        //int currLocal = dangerLocations[row+1][col].getLocationRow();
        //LocationType currDanger = dangerLocations[playerLocation.getLocationRow()][playerLocation.getLocationColumn()].getLocationType();
        
        //Display the location you moved to
        playerLocation.setLocationRow(row);
        playerLocation.setLocationColumn(col);
        console.println("You are now at " + row + "," + col);
        
        location[row][col].setLocationType(LocationType.PLAYERLOCATION);
        //location[currLocal][col].setLocationType(currDanger);
        
        this.displayMap();
    }
    
    private void displayMap() {
        
        console.println("Map Index: \n\n"
                + "N: No Dangers"
                + "\nF: Fire Spout"
                + "\nR: ROUS Rats of Unusual Size"
                + "\nL: Lightning Sand"
                + "\nS: Your Start position"
                + "\nE: Your End position"
                + "\n");
        
        Map map = FireSwamp.getCurrentGame().getGameMap();
        
        for(int row = 0; row < Map.ROWS; row++) {
            for(int col = 0; col < Map.COLUMNS; col++) {
                char locationType = map.getLocationAt(row, col).getLocationType().toString().charAt(0);
                console.print(locationType + "\t");
                
            }
            console.println("");
            console.println("");
            console.println("");
        }
    }
    
    
}
