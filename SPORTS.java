import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class Quiz4 extends JFrame implements ActionListener  
{  
    JLabel l,l1;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    Quiz4(String s)  
    {  
        super(s);  
        l=new JLabel();  
         l1=new JLabel("SPORTS"); 
         l1.setBounds(500,100,500,100);
             l1.setFont(new Font("Arial",Font.BOLD,100));
         add(l1);
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Bookmark"); 
         b3=new JButton("Q.1"); 
          b4=new JButton("Q.2"); 
           b5=new JButton("Q.3"); 
            b6=new JButton("Q.4");  
            b7=new JButton("Q.5"); 
             b8=new JButton("Q.6"); 
              b9=new JButton("Q.7"); 
               b10=new JButton("Q.8"); 
                b11=new JButton("Q.9"); 
                b12=new JButton("Q.10");
       
        add(b1);
        add(b2); 
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        set();  
        l.setBounds(500,240,600,30);  
            l.setFont(new Font("Arial",Font.BOLD,20));
        jb[0].setBounds(500,280,5000,20);  
        jb[0].setFont(new Font("Arial",Font.BOLD,20));
        jb[1].setBounds(500,310,5000,20);  
            jb[1].setFont(new Font("Arial",Font.BOLD,20));
        jb[2].setBounds(500,340,5000,20);  
            jb[2].setFont(new Font("Arial",Font.BOLD,20));
        jb[3].setBounds(500,370,5000,20);  
            jb[3].setFont(new Font("Arial",Font.BOLD,20));
        b1.setBounds(500,440,100,30);  
        b2.setBounds(700,440,100,30);
         b3.setBounds(300,140,100,30);
         b4.setBounds(300,180,100,30);
         b5.setBounds(300,220,100,30);
         b6.setBounds(300,260,100,30);
         b7.setBounds(300,300,100,30);
         b8.setBounds(300,340,100,30);
         b9.setBounds(300,380,100,30);
         b10.setBounds(300,420,100,30);
         b11.setBounds(300,460,100,30);
         b12.setBounds(300,500,100,30);
        
         
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
          b1.addActionListener(this);  
        b2.addActionListener(this); 
         b3.addActionListener(this); 
          b4.addActionListener(this); 
           b5.addActionListener(this); 
            b6.addActionListener(this); 
             b7.addActionListener(this);  
             b8.addActionListener(this); 
              b9.addActionListener(this); 
           b10.addActionListener(this); 
           b11.addActionListener(this);
            b12.addActionListener(this); 
        
    }  

    
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getSource()==b2)  
        {  
            if(current==0)  
            {
                b3.setBackground(Color.CYAN);
                b3.setForeground(Color.BLACK);
                
            }
            if(current==1)  
            {
                b4.setBackground(Color.CYAN);
                b4.setForeground(Color.BLACK);
               
            }
            if(current==2)  
            {
                b5.setBackground(Color.CYAN);
                b5.setForeground(Color.BLACK);
                
                
            }
            if(current==3)  
            {
                b6.setBackground(Color.CYAN);
                b6.setForeground(Color.BLACK);
               
            }
            if(current==4)  
            {
                b7.setBackground(Color.CYAN);
                b7.setForeground(Color.BLACK);
                
            }
            if(current==5)  
            {
                b8.setBackground(Color.CYAN);
                b8.setForeground(Color.BLACK);
                
            }
            if(current==6)  
            {
                b9.setBackground(Color.CYAN);
                b9.setForeground(Color.BLACK);
                
            }
            if(current==7)  
            {
                b10.setBackground(Color.CYAN);
                b10.setForeground(Color.BLACK);
               
            }
            if(current==8)  
            {
                b11.setBackground(Color.CYAN);
                b11.setForeground(Color.BLACK);
                
            }
            if(current==9)  
            {
                b12.setBackground(Color.CYAN);
                b12.setForeground(Color.BLACK);
                
            }
           
            
            
        }  
        
        if(e.getSource()==b3)
        {
         l.setText("Que1:The word �Agricultural shot� is used in which among the following sports?");  
            jb[0].setText("Golf ");jb[1].setText("Cricket");jb[2].setText("Hockey");jb[3].setText("Polo ");    
             l.setBounds(500,240,1000,30);    
             current=0;
        }
       
             if(e.getSource()==b4)
        {
           l.setText("Que2:THE WORLD BENEATH HIS FEET is a Biography of ?");  
             l.setBounds(500,240,1500,30); 
        jb[0].setText("Nawab Pataudi");jb[1].setText("Pulela Gopichand");jb[2].setText("Ajit Wadekar ");jb[3].setText("Sachin Tendulkar ");   
            current=1;
        }
           if(e.getSource()==b5)
        {
          l.setText("Que3:Which among the following country is the host of 2018 Commonwealth Games ?");  
             l.setBounds(500,240,3000,30); 
            jb[0].setText("India");jb[1].setText("England");jb[2].setText("Canada");jb[3].setText("Australia");  
            current=2;
        }
          if(e.getSource()==b6)
        {
             l.setText("Que4:Murugappa Gold Cup is related to which among the following sports?");  
             l.setBounds(500,240,1000,30); 
            jb[0].setText("Table Tennis");jb[1].setText("Football");jb[2].setText("Hockey");jb[3].setText("Basketball"); 
            current=3;
        }
        if(e.getSource()==b7)
        {
               l.setText("Que5: Ian Thorpe is related to ?");  
             l.setBounds(500,240,15000,30); 
            jb[0].setText("Table Tennis");jb[1].setText("Hockey");jb[2].setText("Football");jb[3].setText("Swimming");       
            current=4;
            
        }
        if(e.getSource()==b8)
        {
             l.setText("Que6:Which of the following trophies is related with the game of �Football ?");  
             l.setBounds(500,240,3000,30); 
            jb[0].setText("V.C.C. Cup");jb[1].setText("Merdeka Cup");jb[2].setText("Everest Cup");jb[3].setText("Mumbai Gold Cup");  
           
            current=5;
        }
         if(e.getSource()==b9)
        {
               l.setText("Que7:Birdie and Eagle are two terms related to which of the following sports ? ");  
             l.setBounds(500,240,3000,30); 
            jb[0].setText("Snooker");jb[1].setText("Tennis");jb[2].setText("Golf");  
                        jb[3].setText("Badminton");   
                         
                        current=6;
                     
        }
         if(e.getSource()==b10)
        {
             l.setText("Que8:The word Gambit is related to which of the following sports ?");  
             l.setBounds(500,240,1000,30); 
            jb[0].setText("Chess");jb[1].setText("Cricket");jb[2].setText("Badminton");  
                        jb[3].setText("Golf");
                        current=7;
                     
            
        }
        if(e.getSource()==b11)
        {
           l.setText("Que9:For which of the following games / sports the term Ring is not used for ground/ space?");  
               l.setBounds(500,240,1000,30);
            jb[0].setText("Boxing");jb[1].setText("Gymnastics");jb[2].setText("Ice Hockey");jb[3].setText("Baseball");  
            current=8;
            
        }
         if(e.getSource()==b12)
        {
            
             l.setText("Que10:The �Marquess of Queensberry rules�code is accepted rules in which of the following sports ?");  
             l.setBounds(500,240,1000,30); 
            jb[0].setText("Chess");jb[1].setText("Boxing");jb[2].setText("Hockey");  
                        jb[3].setText("Tennis");      
            b1.setEnabled(false);  
                b2.setText("Result");  
                current=9;
                        
        }
        
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1:The word �Agricultural shot� is known to be used sometimes in which among the following sports?");  
            jb[0].setText("Golf ");jb[1].setText("Cricket");jb[2].setText("Hockey");jb[3].setText("Polo ");    
             l.setBounds(500,240,1000,30); 
        }  
        if(current==1)  
        {  
            l.setText("Que2:THE WORLD BENEATH HIS FEET is a Biography of ?");  
             l.setBounds(500,240,1500,30); 
        jb[0].setText("Nawab Pataudi");jb[1].setText("Pulela Gopichand");jb[2].setText("Ajit Wadekar ");jb[3].setText("Sachin Tendulkar "); 
        }  
        if(current==2)  
        {  
            l.setText("Que3:Which among the following country is the host of 2018 Commonwealth Games ?");  
             l.setBounds(500,240,3000,30); 
            jb[0].setText("India");jb[1].setText("England");jb[2].setText("Canada");jb[3].setText("Australia");  
        }  
        if(current==3)  
        {  
            l.setText("Que4:Murugappa Gold Cup is related to which among the following sports?");  
             l.setBounds(500,240,1000,30); 
            jb[0].setText("Table Tennis");jb[1].setText("Football");jb[2].setText("Hockey");jb[3].setText("Basketball");  
        }  
        if(current==4)  
        {  
        l.setText("Que5:With which among the following sports, Ian Thorpe is related to ?");  
             l.setBounds(500,240,15000,30); 
            jb[0].setText("Table Tennis");jb[1].setText("Hockey");jb[2].setText("Football");jb[3].setText("Swimming"); 
        }  
        if(current==5)  
        {  
         l.setText("Que6:Which of the following trophies is related with the game of �Football ?");  
             l.setBounds(500,240,3000,30); 
            jb[0].setText("V.C.C. Cup");jb[1].setText("Merdeka Cup");jb[2].setText("Everest Cup");jb[3].setText("Mumbai Gold Cup");  
        }  
        if(current==6)  
        {  
           l.setText("Que7:Birdie and Eagle are two terms related to which of the following sports ? ");  
             l.setBounds(500,240,3000,30); 
            jb[0].setText("Snooker");jb[1].setText("Tennis");jb[2].setText("Golf");  
                        jb[3].setText("Badminton");    
                      
        }  
        if(current==7)  
        {  
         l.setText("Que8:The word Gambit is related to which of the following sports ?");  
             l.setBounds(500,240,1000,30); 
            jb[0].setText("Chess");jb[1].setText("Cricket");jb[2].setText("Badminton");  
                        jb[3].setText("Golf");          
        }  
        if(current==8)  
        {  
         l.setText("Que9:For which of the following games / sports the term Ring is not used for ground/ space?");  
               l.setBounds(500,240,1000,30);
            jb[0].setText("Boxing");jb[1].setText("Gymnastics");jb[2].setText("Ice Hockey");jb[3].setText("Baseball");  
        }  
        if(current==9)  
        {  
           l.setText("Que10:The �Marquess of Queensberry rules� is a code of generally accepted rules in which of the following sports ?");  
             l.setBounds(500,240,1000,30); 
            jb[0].setText("Chess");jb[1].setText("Boxing");jb[2].setText("Hockey");  
                        jb[3].setText("Tennis"); 
        }  
          
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(500,280+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[2].isSelected());  
        if(current==4)  
            return(jb[3].isSelected());  
        if(current==5)  
            return(jb[1].isSelected());  
        if(current==6)  
            return(jb[2].isSelected());  
        if(current==7)  
            return(jb[0].isSelected());  
        if(current==8)  
            return(jb[3].isSelected());  
        if(current==9)  
            return(jb[1].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
        new Quiz4("SPORTS");  
    }  
}  