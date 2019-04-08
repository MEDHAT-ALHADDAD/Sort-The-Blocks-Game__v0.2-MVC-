package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Medhat
 */
public class EndGameController {
        public  static void SaveScore(int score){
        String name = JOptionPane.showInputDialog("please Enter your name: ");
        JOptionPane.showMessageDialog(null,"Congratulations!! You Won\nScore: "+score+" Moves!!");
        if(!"".equals(name)){
            try {
                FileWriter fw;
                PrintWriter pw;
                fw = new FileWriter("fame.txt", true); //enable append
                pw = new PrintWriter(fw, true);//enable autoflushing
                pw.println(name);
                pw.println(score);
                System.exit(0);
            } catch (IOException ex) {
                Logger.getLogger(PlayGameController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
