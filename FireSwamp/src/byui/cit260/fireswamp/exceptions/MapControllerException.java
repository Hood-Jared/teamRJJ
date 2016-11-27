/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.exceptions;

/**
 *
 * @author blvd
 */
public class MapControllerException extends Exception {
    private String i;

    public MapControllerException() {
    }

    public MapControllerException(String message) {
        //super(message);
        i = message;
    }

    public MapControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MapControllerException(Throwable cause) {
        super(cause);
    }

    public MapControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public String getResponse(){
        return i;
    }
}
