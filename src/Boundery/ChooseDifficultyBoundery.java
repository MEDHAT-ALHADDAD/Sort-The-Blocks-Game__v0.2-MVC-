package Boundery;

import Controller.ChooseDifficultyController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Medha
 */
public class ChooseDifficultyBoundery extends JFrame implements ActionListener{
    
    private JButton btn3x3;
    private JButton btn4x4;
    private JButton btn5x5;
    private JButton btnExit;

    public ChooseDifficultyBoundery()
    {
        init();
    }
    private void init() {
        this.setTitle("Sort The Blocks v1.0");
        this.setBounds(620, 180,650,150);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        Container c = this.getContentPane();
        c.setLayout(null);

        btn3x3= new JButton("Play 3x3 (Easy)");
        btn3x3.setBounds(50,15,150,30);
        c.add(btn3x3);

        btn4x4= new JButton("Play 4x4 (Medium)");
        btn4x4.setBounds(250,15,150,30);
        c.add(btn4x4);

        btn5x5= new JButton("Play 5x5 (Hard)");
        btn5x5.setBounds(450,15,150,30);
        c.add(btn5x5);

        btnExit= new JButton("Exit");
        btnExit.setBounds(264,60,120,30);
        c.add(btnExit);



        btn3x3.addActionListener(this);
        btn4x4.addActionListener(this);
        btn5x5.addActionListener(this);
        btnExit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnExit)
            {
                    this.dispose();
            }
            if(e.getSource()==btn4x4)
            {
                    ChooseDifficultyController.ChooseDifficulty(4);
                    this.setVisible(false);
            }
            if(e.getSource()==btn3x3)
            {
                ChooseDifficultyController.ChooseDifficulty(3);
                this.setVisible(false);
            }
            if(e.getSource()==btn5x5)
            {
                ChooseDifficultyController.ChooseDifficulty(5);
                this.setVisible(false);
            }
    }	
}
