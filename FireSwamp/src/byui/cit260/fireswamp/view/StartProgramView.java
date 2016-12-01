/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import byui.cit260.fireswamp.exceptions.DangerControllerException;
import byui.cit260.fireswamp.exceptions.MapControllerException;
import java.io.IOException;

/**
 *
 * @author ryahh
 */
public class StartProgramView {

    public void display() throws MapControllerException, IOException{
        
        try {
            WelcomeView wv = new WelcomeView();
            wv.displayStartProgramView();
        } catch (DangerControllerException | IOException dce) {
            ErrorView.display("StartProgramView", dce.getMessage());
        }
    }
    
}
