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
import byui.cit260.fireswamp.controller.MapController;
import byui.cit260.fireswamp.exceptions.MapControllerException;
//import byui.cit260.fireswamp.view.FireSpoutsView;
import byui.cit260.fireswamp.view.GameMenuView;
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

    public static void main(String[] args) throws MapControllerException{
        
//        GameMenuView gmv = new GameMenuView();
//        gmv.doAction("W");
        
//        MapController mc = new MapController();
//        mc.checkMoveNorth(-1);
//        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
         
                
    }
    private static Game currentGame = null;
    private static Player player = null; 
    
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
    
    

}