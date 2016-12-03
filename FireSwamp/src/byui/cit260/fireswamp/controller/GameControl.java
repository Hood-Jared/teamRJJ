/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import FireSwamp.FireSwamp;
import byui.cit260.fireswamp.Game;
import byui.cit260.fireswamp.Map;
import byui.cit260.fireswamp.Player;
import byui.cit260.fireswamp.exceptions.DangerControllerException;
import byui.cit260.fireswamp.exceptions.GameControlException;
import byui.cit260.fireswamp.view.ErrorView;
import byui.cit260.fireswamp.view.GameMenuView;
import byui.cit260.fireswamp.view.View;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.System.console;

/**
 *
 * @author ryahh
 */
public class GameControl extends View {
    
    public void createNewGame(Player player) {
        
        Game currentGame = new Game();
        
        currentGame.setGamePlayer(player);
        
        Map map = new Map();
        map.init();
        
        currentGame.setGameMap(map);
        
        FireSwamp.setCurrentGame(currentGame);
    }
    
    public static Player createPlayer(String name){
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setPlayerName(name);
        
        FireSwamp.setPlayer(player);
        
        return player;
    }
    
    public static void saveGame(Game game, String filepath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filepath) throws GameControlException{
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read the game object from file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        FireSwamp.setCurrentGame(game);
    }
    
    

    @Override
    public boolean doAction(String value) throws DangerControllerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

