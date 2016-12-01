/*THIS IS THE MAIN CLASS
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FireSwamp;
//import byui.cit260.fireswamp.Character;
//import byui.cit260.fireswamp.Items;
//import byui.cit260.fireswamp.Game;
//import byui.cit260.fireswamp.Scene;
//import byui.cit260.fireswamp.Dangers;
//import byui.cit260.fireswamp.Location;
//import byui.cit260.fireswamp.Map;
import byui.cit260.fireswamp.view.StartProgramView;
import byui.cit260.fireswamp.Game;
//import byui.cit260.fireswamp.Location;
import byui.cit260.fireswamp.Player;
//import byui.cit260.fireswamp.controller.MapController;
import byui.cit260.fireswamp.exceptions.MapControllerException;
import byui.cit260.fireswamp.view.ErrorView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
//import byui.cit260.fireswamp.view.FireSpoutsView;
//import byui.cit260.fireswamp.view.GameMenuView;
//import byui.cit260.fireswamp.view.WelcomeView;
//import byui.cit260.fireswamp.view.MainMenuView;
//import byui.cit260.fireswamp.view.HelpMenuView;
//import byui.cit260.fireswamp.view.ItemsView;
//import byui.cit260.fireswamp.Location;
/**
 *
 * @author blvd
 */
public class FireSwamp {
    
    public static void main(String[] args) {
        
//        GameMenuView gmv = new GameMenuView();
//        gmv.doAction("W");
        
//        MapController mc = new MapController();
//        mc.checkMoveNorth(-1);
        
        try {
            // open character stream files for end user input and output
            FireSwamp.inFile = new BufferedReader(new InputStreamReader(System.in));
            FireSwamp.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            FireSwamp.logFile = new PrintWriter(filePath);

            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

        } catch (Throwable e) {
            ErrorView.display("FireSwamp", "Exception: " + e.toString() +
                            "\nCause: " + e.getCause() +
                            "\nMessage: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (FireSwamp.inFile != null)
                    FireSwamp.inFile.close();
                
                if (FireSwamp.outFile != null)
                    FireSwamp.outFile.close();
                
                if (FireSwamp.logFile != null)
                    FireSwamp.logFile.close();
                
            } catch (IOException ex) {
                ErrorView.display("FireSwamp", "Error closing files");
                return;
            }
        }
    }
    
    //game information
    private static Game currentGame = null;
    private static Player player = null; 
    //outFile & inFile are variables for the reading and writing to files
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    // create error log file variable
    private static PrintWriter logFile = null;
    

    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        FireSwamp.currentGame = currentGame;
    }
  
    /**
     * @param player
     */  
    
    public static Player getPlayer() {
        return FireSwamp.player;
    }
    
    public static void setPlayer(Player player) {
        FireSwamp.player = player;
    }
    // For the getting and setting of the outFile & inFile variables 
    // (PrintWriter & BufferedReader object type)
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FireSwamp.outFile = outFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FireSwamp.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        FireSwamp.logFile = logFile;
    }

}