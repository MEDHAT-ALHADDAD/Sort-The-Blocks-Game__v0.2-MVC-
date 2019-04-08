package Controller;

import Boundery.ChooseDifficultyBoundery;
import Boundery.ChooseDifficultyBoundery;
import Entity.GameEntity;
import Entity.GameEntity;


/**
 *
 * @author Medha
 */
public class ChooseDifficultyController {
    public static void ChooseDifficultyRendering(){
    ChooseDifficultyBoundery f1 = new ChooseDifficultyBoundery();
    f1.setVisible(true);
    }
    
    public static void ChooseDifficulty(int e){
        GameEntity.setSize(e);
    }
}
