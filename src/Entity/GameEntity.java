package Entity;

import java.io.File;

/**
 *
 * @author Medha
 */
public class GameEntity {
    private static int size = 4;
    private static int score=0; //Score = no. of movements as the game ends

    public static void setSize(int size) {
        GameEntity.size = size;
    }
    public static int getSize() {
        return size;
    }
    public static void setScore(int score) {
        GameEntity.score = score;
    }
    public static int getScore() {
        return score;
    }
    public static void scoreInc(){
        score++;
    }
}
