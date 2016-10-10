/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author blvd
 */
public class Game implements Serializable{
    
    private String enterSwampYorN;
    private String numberOfTurns;
    private String help;

    // default constructor function
    public Game() {
    }

    // getter and setter function
    public String getEnterSwampYorN() {
        return enterSwampYorN;
    }

    public void setEnterSwampYorN(String enterSwampYorN) {
        this.enterSwampYorN = enterSwampYorN;
    }

    public String getNumberOfTurns() {
        return numberOfTurns;
    }

    public void setNumberOfTurns(String numberOfTurns) {
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
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.enterSwampYorN);
        hash = 53 * hash + Objects.hashCode(this.numberOfTurns);
        hash = 53 * hash + Objects.hashCode(this.help);
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
        if (!Objects.equals(this.enterSwampYorN, other.enterSwampYorN)) {
            return false;
        }
        if (!Objects.equals(this.numberOfTurns, other.numberOfTurns)) {
            return false;
        }
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
