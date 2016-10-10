/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author blvd
 */
public class Map implements Serializable{
    private String columnCount;
    private int rowCount;
    private String playerMap;

    // default constructor function
    public Map() {
    }
    
    // getter and setter functions
    public String getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(String columnCount) {
        this.columnCount = columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public String getPlayerMap() {
        return playerMap;
    }

    public void setPlayerMap(String playerMap) {
        this.playerMap = playerMap;
    }
    
    // hashCode(), toString(), equals() functions
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.columnCount);
        hash = 97 * hash + this.rowCount;
        hash = 97 * hash + Objects.hashCode(this.playerMap);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + ", playerMap=" + playerMap + '}';
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
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.playerMap, other.playerMap)) {
            return false;
        }
        return true;
    }
    
    
}
