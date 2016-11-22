/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author blvd
 */
public class Location implements Serializable {

    private int locationRow;
    private int locationColumn;
    private boolean locationVisited;
    private String locationDescription;
    private LocationType locationType;
    Random r = new Random();
    
    
    
    // default constructor function
    //public LocationType Location() {
        //LocationType[] v = locationType.values();
        //return v[r.nextInt(4)];
    //}

    public int getLocationRow() {
        return locationRow;
    }

    public void setLocationRow(int locationRow) {
        this.locationRow = locationRow;
    }

    public int getColumn() {
        return locationColumn;
    }

    public void setColumn(int column) {
        this.locationColumn = locationColumn;
    }

    public int getLocationColumn() {
        return locationColumn;
    }

    public void setLocationColumn(int locationColumn) {
        this.locationColumn = locationColumn;
    }

    public boolean isLocationVisited() {
        return locationVisited;
    }

    public void setLocationVisited(boolean locationVisited) {
        this.locationVisited = locationVisited;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    // hashCode(), toString(), equals() functions
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        return true;
    }

}
