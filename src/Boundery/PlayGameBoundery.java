package Boundery;

import Controller.PlayGameController;
import Entity.GameEntity;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Medhat
 */
public class PlayGameBoundery extends JFrame implements ActionListener{
    private JButton[] btns = new JButton[GameEntity.getSize()*GameEntity.getSize()];
    private int[] randArr;
    Container c =this.getContentPane();
    private int swapNum;
    SecureRandom srd= new SecureRandom();
    
    public PlayGameBoundery(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Sort The Blocks ");
        this.setResizable(false);
        int wi = GameEntity.getSize()*100 + 20;
        int he = GameEntity.getSize()*100 + 45;
        this.setBounds(620, 180,wi,he);
        c.setLayout(null);
        randArr = PlayGameController.uniqueRandomNumberGenerator(0, GameEntity.getSize()*GameEntity.getSize()-1);
        for(int i = 0;i<GameEntity.getSize()*GameEntity.getSize();i++){
            randArr[i]+=1;
        }
        /**
        * The For loop that creates the Buttons by Null layout.
        * The space in the game is the size*size the but it's not added to the 
        * container providing a blank space 
        */
        for(int i=0;i<GameEntity.getSize()*GameEntity.getSize();i++){
            btns[i] = new JButton(""+(randArr[i]));
            btns[i].setBounds(((i%GameEntity.getSize())*100)+5,((i/GameEntity.getSize())*100)+5,100,100);
            btns[i].addActionListener(this);
            if(randArr[i]!=GameEntity.getSize()*GameEntity.getSize()){
            c.add(btns[i]);
            }
            else{
            	swapNum=i;
            }    
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        PlayGameController.Replace(e,this.btns, this.swapNum, this.randArr);
    }
}
