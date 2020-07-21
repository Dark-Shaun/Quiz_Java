import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.text.*;  
import java.util.*;  

public class Quiz1 extends JFrame implements ActionListener,Runnable
{
    JFrame f;
    JButton b1,b2,b3,b4;
    JLabel l1,b5;
    Thread t=null;  
int hours=0, minutes=0, seconds=0;  
String timeString = " "; 
    
    Quiz1()
    {
    JFrame f=new JFrame();
  

    b1=new JButton("SPACE");
    b2=new JButton("GEOGRAPHY");
    b3=new JButton("SPORTS");
    b4=new JButton("HISTORY");
    l1=new JLabel("QUIZ");
    b5=new JLabel();
    
        t = new Thread(this); //for Multi-Threading 
        t.start();
        
       
    
   b5.setFont(new Font("Arial",Font.BOLD,25));
      l1.setFont(new Font("Arial",Font.BOLD,150));
    b1.setBounds(100,350,250,40);
    b2.setBounds(400,350,250,40);
    b3.setBounds(700,350,250,40);
    b4.setBounds(1000,350,250,40);
    l1.setBounds(75,100,450,200);
    b5.setBounds(1250,0,250,250);
    f.add(b1);
      f.add(b2);
        f.add(b3);
          f.add(b4);
          f.add(l1);
          f.add(b5);
          
          b1.addActionListener(this);
           b2.addActionListener(this);
            b3.addActionListener(this);
             b4.addActionListener(this);
             
               f.setLayout(null);
f.setVisible(true);
f.setSize(500,500);
    
    }

    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== b1)
        {
          new Quiz2("SPACE"); 
        }
        
        if(e.getSource()== b2)
        {
       new Quiz3("GEOGRAPHY"); 
        }
        
        if(e.getSource()== b3)
        {
          new Quiz4("SPORTS"); 
}
        if(e.getSource()== b4)
        {
          new Quiz5("HISTORY"); 
        }
    }
    
 



    public void run() {
      
        try{  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
         
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  
            printTime();  
  
            t.sleep( 1000 );  
         }  
      }  
         catch (Exception e) { }  
 }  
    public void printTime(){  
b5.setText(timeString);  
} 
    
    public static void main(String args[]) 
{

new Quiz1();


}
        
    }
    
    



  