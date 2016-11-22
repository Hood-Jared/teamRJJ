/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
/**
 *
 * @author blvd
 */
public class Map implements Serializable{
    
    Random rand = new Random();
    public static final int ROWS = 5;
    public static final int COLUMNS = 5;
    private Location[][] matrix = new Location[ROWS][COLUMNS];
    private Location mapEntrance = new Location();
    private Location mapExit = new Location();
    

    // default constructor function
    public Map() {
        
    }
    
    public void init() {
                
        mapEntrance.setLocationRow(4);
        mapEntrance.setLocationColumn(rand.nextInt(5));
        mapExit.setLocationRow(0);
        mapExit.setLocationColumn(rand.nextInt(5));
        
        //Random rand = new Random();
        
        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLUMNS; col++) {
                Location location = new Location();
                if(mapEntrance.getLocationRow() == row && mapEntrance.getLocationColumn() == col) {
                    this.specificIndex(location, row, col, 4);
                }
                else if (mapExit.getLocationRow() == row && mapExit.getLocationColumn() == col) {
                    this.specificIndex(location, row, col, 5);
                }
                else {
                    this.randIndex(location, row, col, 3);
                }
                
            }
        }
        
    }
    
    private void specificIndex(Location location, int row, int col, int index){
                
        location.setLocationColumn(col);
        location.setLocationRow(row);
        location.setLocationVisited(false);
        
        int randLocation = index;
        
        location.setLocationType(LocationType.values()[randLocation]);
        
        matrix[row][col] = location; 
    }
    
    private void randIndex(Location location, int row, int col, int index){
                
        location.setLocationColumn(col);
        location.setLocationRow(row);
        location.setLocationVisited(false);
        
        int randLocation = rand.nextInt(index);
        
        location.setLocationType(LocationType.values()[randLocation]);
        
        matrix[row][col] = location; 
    }
    
    public void setMapEntrance(Location mapEntrance) {
        this.mapEntrance = mapEntrance;
    }

    public void setMapExit(Location mapExit) {
        this.mapExit = mapExit;
    }

    public Location getMapEntrance() {
        return mapEntrance;
    }

    public Location getMapExit() {
        return mapExit;
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
    
    // hashCode(), toString(), equals() functions
    @Override          
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Arrays.deepHashCode(this.matrix);
        hash = 17 * hash + Objects.hashCode(this.mapEntrance);
        hash = 17 * hash + Objects.hashCode(this.mapExit);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.matrix, other.matrix)) {
            return false;
        }
        if (!Objects.equals(this.mapEntrance, other.mapEntrance)) {
            return false;
        }
        if (!Objects.equals(this.mapExit, other.mapExit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "matrix=" + matrix + ", mapEntrance=" + mapEntrance + ", mapExit=" + mapExit + '}';
    }
    
    

}
