/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view2;

/**
 *
 * @author jared
 */
public class StartProgramView {

    private String promptMessage;
    
    public StartProgramView() {
      
        this.promptMessage = "\nPlease Enter you name: ";
        this.displayBanner();
        
    }

    public void displayBanner() {
        System.out.println(
                 "\n*         WELCOME TO THE FIRESWAMP         *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                +"\n*                                          *"
                +"\n*          Enter at your own risk!         *"
                +"\n*     The Fire Swamp is full of Dangers    *"
                +"\n*       You must navigate this Dangers     *"
                +"\n*    To survive and get to the other side  *"
                +"\n*          Watch out for the RoUs!         *"
                +"\n*          Rodents of Unsual Size!         *"
                +"\n*     Listen Carefully to the Fire Spurts  *"
                +"\n*                    and                   *"
                +"\n*             The Lightining Sand          *"
                +"\n*        If you can survive you can        *"
                +"\n*     Build your dream home in the swamp.  *"
                +"\n*_*_*_*_*_*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*_*"
                
        );
        
        
        
    }



   
    
}
