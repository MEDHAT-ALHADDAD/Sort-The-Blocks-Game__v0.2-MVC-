package Controller;

import Boundery.ViewLeaderBoundery;
import Boundery.ViewLeaderBoundery;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;

/**
 *
 * @author Medhat
 */
public class ViewLeaderController {
    public static void LeaderRendering(){
        ViewLeaderBoundery f = new ViewLeaderBoundery();
         try{
            BufferedReader br;
            FileReader r = new FileReader("fame.txt");
            br = new BufferedReader(r);
            int i=0;
            while(br.ready()){
                i++;
                JLabel l=new JLabel();
                l.setText(i+" : "+br.readLine()+"      "+"score :"+br.readLine());
                f.add(l);
            }
            if(i==0){
                JLabel l=new JLabel("No History is Found");
                f.add(l);
            }
            br.close();
            f.setVisible(true);
         }catch(HeadlessException | IOException e){
             System.out.println("file not found");
         }
    }
}