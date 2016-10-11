/*THIS IS THE MAIN CLASS
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FireSwamp;
import byui.cit260.fireswamp.Character;
import byui.cit260.fireswamp.Items;
import byui.cit260.fireswamp.Game;
import byui.cit260.fireswamp.Scene;
import byui.cit260.fireswamp.Dangers;
import byui.cit260.fireswamp.Location;
import byui.cit260.fireswamp.Map;
/**
 *
 * @author blvd
 */
public class FireSwamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Character.java values test
        Character character = new Character();
        
        character.setName("Justin Fryar");
        character.setGender("M");
        character.setDescription("I live in Colorado Springs");
        character.setLocation("A3");
        
        String characterInfo = character.toString();
        System.out.println(characterInfo);
        
        //Items.java values test
        Items items = new Items();
        
        items.setItemType("Weapon");
        
        String itemsInfo = items.toString();
        System.out.println(itemsInfo);
        
        //Game.java values test
        Game game = new Game();
        
        game.setEnterSwampYorN("Y");
        game.setHelp("H");
        game.setNumberOfTurns("30");
        
        String gameInfo = game.toString();
        System.out.println(gameInfo);
        
        //Scene.java values test
        Scene scene = new Scene();
        
        scene.setDescription("This is a test description");
        scene.setDisplaySymbol("X");
        scene.setTravelTime(4);
        
        String sceneInfo = scene.toString();
        System.out.println(sceneInfo);
        
        //Danger.java values test
        Dangers dangers = new Dangers();
        
        dangers.setLocation("D6");
        dangers.setTypeOfDanger("ROUS");
        
        String dangersInfo = dangers.toString();
        System.out.println(dangersInfo);
        
        //Location.java values test
        Location location = new Location();
        
        location.setPlayerLocation("D9");
        location.setVisited("V");
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
        
        //Map.java values test
        Map map = new Map();
        
        map.setColumnCount("B");
        map.setPlayerMap("B4");
        map.setRowCount(4);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
    }
    
}