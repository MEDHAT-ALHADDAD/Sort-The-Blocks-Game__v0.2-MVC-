package Boundery;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Medhat
 */
public class ViewLeaderBoundery extends JFrame{
    public ViewLeaderBoundery()
    {
        init();
    }
    
    private void init() {
        this.setLayout(new GridLayout(0,1));
        this.setSize(500, 500);
        this.setLocation(620, 180);
        this.setBackground(Color.yellow);
    }
}