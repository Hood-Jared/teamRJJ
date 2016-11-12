/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blvd
 */
public class FireSpoutsViewTest {
    
    public FireSpoutsViewTest() {
    }

    /**
     * Test of display method, of class FireSpoutsView.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        boolean isCorrect = true;
        FireSpoutsView instance = new FireSpoutsViewImpl();
        instance.display();
    }

    /**
     * Test of doAction method, of class FireSpoutsView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "14";
        FireSpoutsView instance = new FireSpoutsViewImpl();
        boolean expResult = true;
        boolean result = instance.doAction(value);
        assertEquals(expResult, result);
        /*
        value = "14";
        expResult = true;
        result = instance.doAction(value);
        assertEquals(expResult, result);
        
        value = "12";
        expResult = false;
        result = instance.doAction(value);
        assertEquals(expResult, result);
        */
    }

    public class FireSpoutsViewImpl extends FireSpoutsView {
    }
    
}
