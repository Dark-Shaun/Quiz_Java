import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz1 extends JFrame implements ActionListener
{
    JFrame f;
    JButton b1,b2,b3,b4;
    JLabel l1;
    JPanel p1,p2,p3,p4;
    Quiz1()
    {
    JFrame f=new JFrame();
    f.setLayout(null);
f.setVisible(true);
f.setSize(500,500);
    b1=new JButton("SPACE");
    b2=new JButton("GEOGRAPHY");
    b3=new JButton("SPORTS");
    b4=new JButton("HISTORY");
    l1=new JLabel("QUIZ");
    p1=new JPanel();
   
      l1.setFont(new Font("Arial",Font.BOLD,150));
    b1.setBounds(100,350,250,40);
    b2.setBounds(400,350,250,40);
    b3.setBounds(700,350,250,40);
    b4.setBounds(1000,350,250,40);
    l1.setBounds(75,100,450,200);
    f.add(b1);
      f.add(b2);
        f.add(b3);
          f.add(b4);
          f.add(l1);
    
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== b1)
        {
          new Quiz2();  
        }
        
        if(e.getSource()== b2)
        {
          new Quiz3();  
        }
        
        if(e.getSource()== b3)
        {
          new Quiz4();  
        }
        
        if(e.getSource()== b4)
        {
          new Quiz5();  
        }
    }
    
    public static void main(String args[])
{

new Quiz1();


}
}

  