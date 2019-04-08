package Boundery;

import Controller.ChooseDifficultyController;
import Controller.PlayGameController;
import Controller.ViewLeaderController;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

class intro extends javax.swing.JFrame{
    private JLabel introlbl = new javax.swing.JLabel();
    
    public intro()  {
        setTitle("INTRO");
        setAlwaysOnTop(true);
        setName("INTRO");
        setResizable(false);
        getContentPane().setLayout(null);
        introlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/maxresdefault1.jpg")));
        getContentPane().add(introlbl);
        introlbl.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
    }
}

class Start extends javax.swing.JFrame {
    private JButton Start;
    private JButton diff;
    private JButton exit;
    private JButton halloffame;
    private JLabel jLabel1;
    private JPanel jPanel1;
    public Start() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        jPanel1 = new javax.swing.JPanel();
        halloffame = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        diff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));
        setName("START"); // NOI18N
        setResizable(false);
        setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().width/1.4),(int)(Toolkit.getDefaultToolkit().getScreenSize().height/1.4));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        halloffame.setText("Hall of Fame");
        halloffame.addActionListener(this::halloffameActionPerformed);
        jPanel1.add(halloffame);
        halloffame.setBounds(140, 380, 213, 46);

        exit.setText("Exit");
        exit.addActionListener(this::exitActionPerformed);
        jPanel1.add(exit);
        exit.setBounds(140, 480, 213, 46);

        Start.setText("Start");
        Start.addActionListener(this::StartActionPerformed);
        jPanel1.add(Start);
        Start.setBounds(140, 194, 213, 46);
        
        diff.setText("Diffculty");
        diff.addActionListener(this::diffActionPerformed);
        jPanel1.add(diff);
        diff.setBounds(140, 294, 213, 46);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/15112-1920x1080.jpg"))); 
        jLabel1.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>                        
    
    private void StartActionPerformed(java.awt.event.ActionEvent evt) {
       PlayGameController.StartGame();
        this.dispose();
    }
    private void diffActionPerformed(java.awt.event.ActionEvent evt) {
        ChooseDifficultyController.ChooseDifficultyRendering();
    }
    private void halloffameActionPerformed(java.awt.event.ActionEvent evt) {
        ViewLeaderController.LeaderRendering();
    }                                      
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
         System.exit(0);
    }
}

public class MainBoundery {
    public static void main(String[] args) throws FileNotFoundException {
        intro f1=new intro();
        Start start=new Start();
        f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f1.setUndecorated(true);
        f1.setVisible(true);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainBoundery.class.getName()).log(Level.SEVERE, null, ex);
        }
        f1.dispose();
        start.setExtendedState(JFrame.MAXIMIZED_BOTH);
        start.setVisible(true);
    }
}