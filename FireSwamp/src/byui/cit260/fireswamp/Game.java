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
public class Game implements Serializable{
    
    private boolean enterSwampYorN;
    private int numberOfTurns;
    private String help;

    // default constructor function
    public Game() {
    }

    // getter and setter function
    public boolean isEnterSwampYorN() {
        return enterSwampYorN;
    }

    public void setEnterSwampYorN(boolean enterSwampYorN) {
        this.enterSwampYorN = enterSwampYorN;
    }

    public int getNumberOfTurns() {
        return numberOfTurns;
    }

    public void setNumberOfTurns(int numberOfTurns) {
        this.numberOfTurns = numberOfTurns;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }
    
    // hashCode(), toString(), equals() functions
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.enterSwampYorN ? 1 : 0);
        hash = 29 * hash + this.numberOfTurns;
        hash = 29 * hash + Objects.hashCode(this.help);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "enterSwampYorN=" + enterSwampYorN + ", numberOfTurns=" + numberOfTurns + ", help=" + help + '}';
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
        final Game other = (Game) obj;
        if (this.enterSwampYorN != other.enterSwampYorN) {
            return false;
        }
        if (this.numberOfTurns != other.numberOfTurns) {
            return false;
        }
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        return true;
    }
    
    
}
