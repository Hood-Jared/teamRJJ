/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

//import java.util.Scanner;

import byui.cit260.fireswamp.exceptions.DangerControllerException;
import java.io.IOException;


/**
 *
 * @author ryahh
 */
public interface InterfaceView {
    
    public void display()throws DangerControllerException, IOException;
    public String getInput()throws DangerControllerException, IOException;
    public boolean doAction(String value) throws DangerControllerException;
    
  
}
