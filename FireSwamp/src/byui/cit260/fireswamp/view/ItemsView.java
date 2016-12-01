/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;
import byui.cit260.fireswamp.Items;

/**
 *
 * @author blvd
 */
public class ItemsView extends View {
    
    
    
    public ItemsView() {
        Items items = new Items();
        
        console.println("\nThis is your current inventory"
                + "\n"
                + "\nRope(s)\t\t\t" + items.getRope()
                + "\nBucket(s) of Water\t" + items.getBucketOfWater()
                + "\n"
                + "\nH - Help Menu"
                + "\nB - Go back");
        
        console.println("\n" + items.getRope() + "\n" + items.getBucketOfWater());
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
