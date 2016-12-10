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
    private Location playerLocation = new Location();
    private Location[][] matrix = new Location[ROWS][COLUMNS];
    private Location[][] dangerMap = new Location[ROWS][COLUMNS];
    private Location mapEntrance = new Location();
    private Location mapExit = new Location();
    
    public Map() {        
    }
    
    public void init() {
                
        mapEntrance.setLocationRow(4);
        mapEntrance.setLocationColumn(rand.nextInt(5));
        mapExit.setLocationRow(0);
        mapExit.setLocationColumn(rand.nextInt(5));
        
        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLUMNS; col++) {
                Location location = new Location();
                //set the starting point on the map
                if(mapEntrance.getLocationRow() == row && mapEntrance.getLocationColumn() == col) {
                    this.specificIndex(location, row, col, 5);
                    
                    //set players start and current location
                    playerLocation.setLocationRow(row);
                    playerLocation.setLocationColumn(col);
                }
                //set the exit point of the map
                else if (mapExit.getLocationRow() == row && mapExit.getLocationColumn() == col) {
                    this.specificIndex(location, row, col, 4);
                }
                //randomly set the dangers on the map
                else {
                    this.randIndex(location, row, col, 4);
                }
            }
        }  
        //dangerMap = matrix;
    }
    
    private void specificIndex(Location location, int row, int col, int index){
                
        location.setLocationColumn(col);
        location.setLocationRow(row);
        location.setLocationVisited(false);
        
        int specificIndex = index;
        
        location.setLocationType(LocationType.values()[specificIndex]);
        
        //Set the dangers for the matrix and danger map copies
        matrix[row][col] = location; 
        //dangerMap[row][col] = matrix[row][col];
    }
    
    private void randIndex(Location location, int row, int col, int index){
                
        location.setLocationColumn(col);
        location.setLocationRow(row);
        location.setLocationVisited(false);
        
        int randLocation = rand.nextInt(index);
        
        location.setLocationType(LocationType.values()[randLocation]);
        
        //Set the dangers for the matrix and danger map copies
        matrix[row][col] = location; 
        //dangerMap[row][col] = matrix[row][col];
    }

    public void setPlayerLocation(Location playerLocation) {
        this.playerLocation = playerLocation;
    }
    
    public void setMapEntrance(Location mapEntrance) {
        this.mapEntrance = mapEntrance;
    }

    public void setMapExit(Location mapExit) {
        this.mapExit = mapExit;
    }

    public Location getPlayerLocation() {
        return playerLocation;
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
    
    public Location getLocationFromDangerMapAt(int row, int col){
        return dangerMap[row][col];
    }
    
    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    public Location[][] getDangerMap() {
        return dangerMap;
    }

    public void setDangerMap(Location[][] dangerMap) {
        this.dangerMap = dangerMap;
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
