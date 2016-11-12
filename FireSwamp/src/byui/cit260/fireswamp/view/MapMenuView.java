/*
 * @author jared
 */

package byui.cit260.fireswamp.view;
import java.util.Scanner;


public abstract class MapMenuView extends View {


    public MapMenuView() {
        super("\nMap Menu"
            + "\nO - Open Map"
            + "\nL - Return to Game"
            + "\nQ - Quit"
            + "\n");
    }

    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'O':
                openMap();
                break;
            case 'R':
                returnGame();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }

}