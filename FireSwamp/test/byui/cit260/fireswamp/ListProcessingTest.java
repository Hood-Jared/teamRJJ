/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blvd
 */
public class ListProcessingTest {
    
    public ListProcessingTest() {
    }

    /**
     * Test of sum method, of class ListProcessing.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int[] list = {5, 6, 8, 10};
        ListProcessing instance = new ListProcessing();
        int expResult = 29;
        int result = instance.sum(list);
        assertEquals(expResult, result);
    }

    /**
     * Test of avg method, of class ListProcessing.
     */
    @Test
    public void testAvg() {
        System.out.println("avg");
        int[] list = {5, 6, 8, 10};
        ListProcessing instance = new ListProcessing();
        int expResult = 7;
        int result = instance.avg(list);
        assertEquals(expResult, result);
    }

    /**
     * Test of max method, of class ListProcessing.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testMax() {
        System.out.println("max");
        int[] list = {5, 6, 8, 10};
        ListProcessing instance = new ListProcessing();
        int expResult = 10;
        int result = instance.max(list);
        assertEquals(expResult, result);
    }

    /**
     * Test of min method, of class ListProcessing.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        int[] list = {5, 6, 8, 10};
        ListProcessing instance = new ListProcessing();
        int expResult = 5;
        int result = instance.min(list);
        assertEquals(expResult, result);
    }

    /**
     * Test of search method, of class ListProcessing.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] list = {5, 6, 8, 10};
        int value = 8;
        ListProcessing instance = new ListProcessing();
        int expResult = 2;
        int result = instance.search(list, value);
        assertEquals(expResult, result);
    }

    /**
     * Test of srt method, of class ListProcessing.
     */
    @Test
    public void testSrt() {
        System.out.println("srt");
        int[] array = {10, 6, 8, 5};
        int[] expResult = {5, 6, 8, 10};
        int[] result = ListProcessing.srt(array);
        assertArrayEquals(expResult, result);
    }

    
}
