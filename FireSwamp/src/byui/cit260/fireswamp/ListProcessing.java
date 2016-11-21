/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

/**
 *
 * @author blvd
 */
public class ListProcessing {
    //This class will help manipulate and sort arrays
    
    int total = 0;
    
    public int sum(int[] list){
        for(int i = 0 ; i <= list.length -1 ; i++) {
            total = total + list[i];
        }
        
        return total;
    }
    
    public int avg(int [] list) {
        int average = 0;
        
        for(int i = 0 ; i <= list.length -1; i++) {
            total = total + list[i];
            average = total / list.length;
        }
        
        return average;
    }
    
    public int max(int[] list) {
        int maxValue = list[0];
        
        for(int i = 1 ; i <= list.length -1; i++) {
            if(list[i] > maxValue) {
                maxValue = list[i];
            }
        }
        
        return maxValue;
    }
    
    public int min(int[] list) {
        int minValue = list[0];
        
        for(int i = 1 ; i <= list.length -1; i++) {
            if(list[i] < minValue) {
                minValue = list[i];
            }
        }
        
        return minValue;
    }
    
    public int search(int[] list, int value) {
        
        for(int i = 0 ; i <= list.length -1; i++) {
            if(list[i] == value) {
                return  i;
            }
        }
        
        return -1;
    }
    
    /**
     *
     * @param array
     */
    public static int[] srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            
        }
        return array;
    }

    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void printNumbers(int[] array){
        for(int a : array) {
            System.out.print(a + ", ");
        }
    }

}
