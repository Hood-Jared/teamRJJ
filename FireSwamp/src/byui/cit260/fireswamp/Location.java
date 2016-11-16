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
public class Location implements Serializable{

    static void setLocationRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setLocationVisited(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int locationRow;
    private int locationColumn;
    private boolean locationVisited;
    private String locationDescription;
    private LocationType locationType;
    
    
    
     // default constructor function
    public Location() {
        
    }  
    
    public int getLocationRow() {
        return locationRow;
    }

    public void setRow(int locationRow) {
        this.locationRow = locationRow;
    }

    public int getColumn() {
        return locationColumn;
    }

    public void setColumn(int column) {
        this.locationColumn = locationColumn;
    }
   

    // hashCode(), toString(), equals() functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.playerLocation);
        hash = 47 * hash + (this.visited ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "playerLocation=" + playerLocation + ", visited=" + visited + '}';
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
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.playerLocation, other.playerLocation)) {
            return false;
        }
        return true;
    }

    void setLocationColumn(int col) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getLocationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
