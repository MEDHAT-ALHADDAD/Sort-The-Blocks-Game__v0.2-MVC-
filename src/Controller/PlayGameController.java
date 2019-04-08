package Controller;

import Entity.GameEntity;
import Boundery.PlayGameBoundery;
import java.awt.event.ActionEvent;
import java.io.*;
import java.security.*;
import java.util.logging.*;
import javax.swing.*;

/**
 * Java doc explanation of the game will be in size x size Frame as the other two frames are similar there's
 * no need to repeat it
 * 
 *
 *The array of buttons have a corresponding array of boolean values to tell if that button is in 
 *its right position or not
 */
public class PlayGameController  extends JFrame{
    int c=9;
    public static void StartGame(){
            PlayGameBoundery f = new PlayGameBoundery();
            f.setVisible(true);
    }
    
    public  static void Replace(ActionEvent e,  JButton[] btns, int swapNum, int[] randArr){
        JButton btnTest =(JButton)e.getSource();
        if(((Math.abs(btnTest.getX()-btns[swapNum].getX())==100)&& 
                (btnTest.getY()==btns[swapNum].getY()))||
                ((btnTest.getX()==btns[swapNum].getX())&&
                (Math.abs(btnTest.getY()-btns[swapNum].getY())==100))){
            try {
                replaceButtons((JButton)e.getSource(),btns[swapNum], btns,randArr);
            } catch (IOException ex) {
                Logger.getLogger(PlayGameController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void replaceButtons(JButton btn1, JButton btn2, JButton[] btns, int[] randArr) throws IOException{
        int tempX1,tempY1,tempX2,tempY2; 
        tempX1=btn1.getX();
        tempY1=btn1.getY();
        tempX2=btn2.getX();
        tempY2=btn2.getY();
        btn2.setLocation(tempX1,tempY1);
        btn1.setLocation(tempX2,tempY2);
        GameEntity.scoreInc();
        if(CheckVictoryController.victoryCheck(btns,randArr)==true|| CheckVictoryController.victoryCheck(btns,randArr)!=true){
                EndGameController.SaveScore(GameEntity.getScore());
        }
    }
    
    /**
     * A Unique Random Number Array Generator 
     * It is used to give different sequences every time the player runs the game
     * @param start the beginning index of the array
     * @param end the ending index of the array
     * @return
     */
    public static int[] uniqueRandomNumberGenerator(int start,int end)
    {
        int n = end - start +1;
        int arr[]= new int[n];
        for(int i=0 ;i<n ; i++){
                arr[i] = i;
        }
        int prodArr[]= new int[n];
        int z = n;
        SecureRandom srd= new SecureRandom();
        for(int i = 0;i<n;i++){
                int v = srd.nextInt(z);
                prodArr[i] = arr[v];
                arr[v] = arr[z-1];
                z--;
        }
        return prodArr;

    }
}