package Controller;

import Entity.GameEntity;
import javax.swing.JButton;

/**
 *
 * @author Medhat
 */
public class CheckVictoryController {
    
        /**
     * The function that changes the boolean array index corresponding to the button index if
     * the button is in its right place or not
     * @param btns
     * @param randArr
     * @return
     */
    public static boolean victoryCheck(JButton[] btns, int[] randArr){
        boolean[] victoryPoints = new boolean[GameEntity.getSize()*GameEntity.getSize()];
        for(int i=0;i<GameEntity.getSize()*GameEntity.getSize();i++)
        {
            victoryPoints[i] = btns[i].getX()==(((randArr[i]-1)%GameEntity.getSize())*100)+5
                    &&btns[i].getY()==(((randArr[i]-1)/GameEntity.getSize())*100)+5;
        }
        return allTrue(victoryPoints);	
    }
        /**
     * Checks if all the boolean array is true 
     * @param victoryPoints
     * @return
     */
    public static boolean allTrue(boolean[] victoryPoints)
    {
        for(int i = 0;i<GameEntity.getSize()*GameEntity.getSize();i++){
            if(victoryPoints[i]!=true)
                return false;
        }
        return true;	
    }
    
}
