/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
/**
 *
 * @author blvd
 */
public class Map implements Serializable{
    public static final int ROWS = 5;
    public static final int COLUMNS = 5;
    private Location[][] matrix = new Location[ROWS][COLUMNS];
    private Location mapEntrance;
    private Location mapExit;

     // default constructor function
    public Map() {
        
    } 
    
    public  void init() {
                
        Random rand = new Random();
        
        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLUMNS; col++) {
               Location location = new Location();
               location.setLocationColumn(col);
               location.setLocationRow(row);
               location.setLocationVisited(false);
               
               int randLocation = rand.nextInt(LocationType.values().length);
               
               location.setLocationType(LocationType.values()[randLocation]);
               
               matrix[row][col] = location; 
            }
        }
        
    }
    
    public Location getLocationAt(int row, int col){
        return matrix[row][col];
        
    }
    
    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    public Location getMapEntrance() {
        return mapEntrance;
    }

    public void setMapEntrance(Location mapEntrance) {
        this.mapEntrance = mapEntrance;
    }

    public Location getMapExit() {
        return mapExit;
    }

    public void setMapExit(Location mapExit) {
        this.mapExit = mapExit;
    }

          
    // hashCode(), toString(), equals() functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.mapEntrance);
        hash = 97 * hash + Objects.hashCode(this.mapExit);
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Map{" + ", mapEntrace =" + mapEntrance + ", mapExit =" + mapExit + '}';
    }

}
