/*THIS IS THE MAIN CLASS
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FireSwamp;
import Character.Character;
/**
 *
 * @author blvd
 */
public class FireSwamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character character = new Character();
        
        character.setName("Justin Fryar");
        character.setGender("M");
        character.setDescription("I live in Colorado Springs");
        character.setLocation("A3");
        
        String characterInfo = character.toString();
        System.out.println(characterInfo);
        
    }
    
}