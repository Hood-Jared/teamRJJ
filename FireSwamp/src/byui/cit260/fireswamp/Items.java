/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

import byui.cit260.fireswamp.view.View;
import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
/**
 *
 * @author blvd
 */
public class Items extends View {
    ListProcessing lp = new ListProcessing();
    Random r = new Random();
    
    private String itemType;
    private int rope = r.nextInt(8);
    private int bucketOfWater = r.nextInt(8);
    
    public void itemPricing(int rope, int bucket) {
        //Input: # of ropes & buckets
        //Processing: Set Random values to item pricing and calculate resulting cost
        //Output: # of each item you purchased, their individual price & total price
        
        //initialize Array
        int prices[] = new int[25];
        int itemData[] = new int[5];
        
        //Assign random prices to each index #
        for(int i = 0 ; i < prices.length -1 ; i++){
            prices[i] = r.nextInt(10);
            }
                
        //Randomly select a price from the array and set it as the price for each item purchased
        int ropePrices = prices[r.nextInt(8)];
        int bucketPrices = prices[r.nextInt(8)];
        
        //Calculate the total cost of the Ropes & Buckets
        int ropeCost = rope * ropePrices;
        int bucketCost = bucketOfWater * bucketPrices;
        
        //Calculate the cost of ropes and buckets together
        int total = ropeCost + bucketCost;
        
        //Output the numbers an Array. Index 0 = rope, 1 = bucketOfWater, 2 = ropePrice, 3 = bucketPrices, 4 = total
        itemData[0] = rope;
        itemData[1] = bucketOfWater;
        itemData[2] = ropePrices;
        itemData[3] = bucketPrices;
        itemData[4] = total;
                
        //print the values in the array
        console.println("\n\nYou purchased " + itemData[0] + " rope(s)." + "\nYou purchased " + itemData[1] + " bucket(s) for water.");
        //Output the cost of each rope and bucket
        console.println("Each rope costs $" + itemData[2] + ".00" + "\nEach bucket costs $" + itemData[3] + ".00");
        //Output the cost of rope and bucket together
        console.println("Your total cost is $" + itemData[4] + ".00");
        
        //Sort & print array lowest to greatest
        lp.srt(prices);
        for(int v : prices) {
            console.print(v + ", ");
        }
        
        
        
    } 
 
    //default constructor function
    public Items() {
    }

    //getter and setter function
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getRope() {
        return rope;
    }

    public void setRope(int rope) {
        this.rope = rope;
    }

    public int getBucketOfWater() {
        return bucketOfWater;
    }

    public void setBucketOfWater(int bucketOfWater) {
        this.bucketOfWater = bucketOfWater;
    }

    // hashCode(), toString(), equals() functions
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.itemType);
        hash = 53 * hash + Objects.hashCode(this.rope);
        hash = 53 * hash + Objects.hashCode(this.bucketOfWater);
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "itemType=" + itemType + ", rope=" + rope + ", bucketOfWater=" + bucketOfWater + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.rope, other.rope)) {
            return false;
        }
        if (!Objects.equals(this.bucketOfWater, other.bucketOfWater)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}