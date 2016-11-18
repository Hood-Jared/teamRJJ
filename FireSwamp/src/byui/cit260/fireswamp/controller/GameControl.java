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

/**
 *
 * @author ryahh
 */
public class GameControl {
    
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
}
