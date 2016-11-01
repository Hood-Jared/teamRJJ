/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author blvd
 */
public class Items implements Serializable{
    
    private String itemType;
    private String rope;
    private String bucketOfWater;
 
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

    public String getRope() {
        return rope;
    }

    public void setRope(String rope) {
        this.rope = rope;
    }

    public String getBucketOfWater() {
        return bucketOfWater;
    }

    public void setBucketOfWater(String bucketOfWater) {
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

 
}