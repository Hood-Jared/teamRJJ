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
public class Dangers implements Serializable{
    
    private String location;
    private String typeOfDanger;

    // default constructor function
    public Dangers() {
    }
    
    // getter and setter functions
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTypeOfDanger() {
        return typeOfDanger;
    }

    public void setTypeOfDanger(String typeOfDanger) {
        this.typeOfDanger = typeOfDanger;
    }

    // hashCode(), toString(), equals() functions
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.location);
        hash = 97 * hash + Objects.hashCode(this.typeOfDanger);
        return hash;
    }

    @Override
    public String toString() {
        return "Dangers{" + "location=" + location + ", typeOfDanger=" + typeOfDanger + '}';
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
        final Dangers other = (Dangers) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.typeOfDanger, other.typeOfDanger)) {
            return false;
        }
        return true;
    }
    
    
}
