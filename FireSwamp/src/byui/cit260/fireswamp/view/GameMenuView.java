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
import byui.cit260.fireswamp.Items;
import byui.cit260.fireswamp.controller.DangerController;
import byui.cit260.fireswamp.controller.GameControl;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author blvd
 */
public class GameMenuView extends View {
    
    Map map = FireSwamp.getCurrentGame().getGameMap();
    //Location[][] dangerMap = FireSwamp.getCurrentGame().getGameMap().getDangerMap();
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
//                    this.returnDanger();
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
//                console.println("Would you like to save your map to a txt file?");
//                switch (getInput().charAt(0)) {
//                    case 'Y':
//                        this.printMapToFile();
//                        this.displayMap();
//                        break;
//                    case 'N':
//                        this.displayMap();
//                        break;
//                    }
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
                console.println("Would you like to save your inventory to a txt file?");
                switch (getInput().charAt(0)){
                    case 'Y':
                        this.printItemsToFile();
                        this.displayItems();
                break;
                    case 'N':
                        this.displayItems();
                        break;
                }
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
            case 'P':
                printDangerMap();
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
    
    private void printDangerMap(){
            
                for(int row = 0; row < Map.ROWS; row++) {
                    for(int col = 0; col < Map.COLUMNS; col++) {
                        char locationType = map.getLocationFromDangerMapAt(row, col).getLocationType().toString().charAt(0);
                        console.print(locationType + "\t");
                    }
                    console.println("");
                    console.println("");
                    console.println("");
                }  
    }
    
    //Moves the player according to the direction they choose
    private void movePlayer(int row, int col) {
        Location[][] map = this.map.getMatrix();
        
        //Save the danger
        int dangerRow = playerLocation.getLocationRow() + row;
        int dangerCol = playerLocation.getLocationColumn() + col;
        LocationType danger = map[dangerRow][dangerCol].getLocationType();
        
        DangerController dc = new DangerController();
        if(danger == LocationType.LIGHTNINGSAND){
                LightningSandView lsv = new LightningSandView();
                lsv.display();
        }
        else if(danger == LocationType.ROUS){
                RousView rs = new RousView();
                rs.display();
        }
        else if(danger == LocationType.FLAMESPURT){
                FireSpoutsView fsv = new FireSpoutsView();
                fsv.display();
        }
        else if(danger == LocationType.END){
            console.println("\nYou win!!");
            MainMenuView mmv = new MainMenuView();
            mmv.display();
        }
        
        //Move the player
        row = playerLocation.getLocationRow() + row;
        col = playerLocation.getLocationColumn() + col;
        playerLocation.setLocationRow(row);
        playerLocation.setLocationColumn(col);
        
//        int row2 = this.map.getMapEntrance().getLocationRow();
//        int col2 = this.map.getMapEntrance().getLocationColumn();
//        map[row2][col2].setLocationType(danger);
        
        map[row][col].setLocationType(LocationType.PLAYERLOCATION);
        //location[currLocal][col].setLocationType(currDanger);
        this.displayMap();
        console.println("You are now at " + row + "," + col);
    }
    
    private void displayMap() {
        try {
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
            
            //console.println("You are at: " + map.getMapEntrance().getLocationRow() + ", " + map.getMapEntrance().getLocationColumn());
        } catch (Exception e) {
            ErrorView.display("displayMap/GAMEMENUVIEW", e.getMessage());
        }
    }
    
    public void printMapToFile(){
        boolean valid = false;
        do {
                    PrintWriter MapLog = null;            
            try {
                    console.println("\n\nEnter the file path where you would like to save this map report\n");
                    String selection = keyboard.readLine();
                    
                    MapLog = new PrintWriter(selection);

                    Map map = FireSwamp.getCurrentGame().getGameMap();

                MapLog.printf("%15s%1s", "Your Map", "\n\n");
                MapLog.print("=====================\n");

                    for(int row = 0; row < Map.ROWS; row++) {
                        for(int col = 0; col < Map.COLUMNS; col++) {
                            char locationType = map.getLocationAt(row, col).getLocationType().toString().charAt(0);

                    // print map to file
                    MapLog.printf("%-5c", locationType);
                        }
                        MapLog.println("");
                    }
                MapLog.println(this.dangersDescription());

                // flush buffer
                MapLog.flush();

                // tell the user the file was saved successfully
                console.println("\nFile saved successfully as: " + selection);
                valid = true;
                Thread.sleep(3000);
            } catch (Exception e) {
                ErrorView.display("printToFile/GAMEMENUVIEW", e.getMessage());
            } finally {
                MapLog.close();
            }
        } while (!valid);
    }
    
    public String dangersDescription(){
        return "\nMap Characteristics:"
                + "\n1. All the dangers on the map are randomly generated"
                + "\n   This means you will face a different set of dangers"
                + "\n   each time you play"
                + "\n2. The start location of the map is randomly generated"
                + "\n   on the bottom row. This means you will always start"
                + "\n   on the bottom row but not always in the same column"
                + "\n3. The end location of the map is randomly generated"
                + "\n   on the top row. This means you will always finish"
                + "\n   on the top row but not always in the same column"
                + "\n"
                + "\nThere are three dangers you should be aware of"
                + "\n"
                + "\nROUS': These are Rodents of Unusual Size. They are"
                + "\nmassive rodents about the size of a dog. In order to get"
                + "\naway from them you will need to be quick on your feet!"
                + "\n"
                + "\nLightning Sand: This is basically quick sand but much,"
                + "\nmuch faster. One step and not only will instantly begin"
                + "\nto such you in but you'll be engulfed in the sand as "
                + "\nfast as gravity can pull you down!"
                + "\n"
                + "\nFire Spouts: These are gas spewing holes in the ground"
                + "\nmuch like a geyser except these don't spout anything so"
                + "\nharmless as water. Be careful you don't jump right into"
                + "\nspurt of flame!";
    }

    private void printItemsToFile() {
     boolean valid = false;
            do {
                try {
                
                    console.println("\n Enter the name you would like the file to be named\n");
                    String selection = keyboard.readLine();
                
                    PrintWriter ItemsLog = new PrintWriter(selection);
                    Items items = FireSwamp.getCurrentGame().getItems();
                
                ItemsLog.printf("%2s", "Your Items are listed", "\n\n");
                ItemsLog.printf(" ");                              
                
                ItemsLog.flush();
                ItemsLog.close();
                            
                    console.println("\nFile saved successfully as: " + selection);
                    valid = true;
                    Thread.sleep(3000);
                
            } catch (Exception e) {
                ErrorView.display("printToFile/GAMEMENUVIEW", e.getMessage());
}
        } while (!valid);
    }

    private void displayItems() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
