/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author blvd
 */
public class Items implements Serializable{
    
    private String itemType; 

    
    // default constructor function
    public Items() {    
    }

    // getter and setter functions
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
    // hashCode(), toString(), equals() functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.itemType);
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "itemType=" + itemType + '}';
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
        return true;
    }
    
}
