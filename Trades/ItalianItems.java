package Trades;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ItalianItems implements ActionListener {
    public static String [] listitaly={"pizza","spaghetti","carpaccio","caprese","Gelato","ciabatta"};
    static JTextField [] count;
    static JLabel  [] tag;
    public int [] totalitaly=new int[6];
    JDialog error=new JDialog();
    JLabel errornotify=new JLabel("invalid count:( Enter a valid count");
    static JDialog italy=new JDialog();
    static JButton submit=new JButton("ADD TO PLATE");
    static Font f=new Font("Verdana",Font.BOLD,15);
   // JButton b=new JButton("hello");

    public void Italian(){
        error.setSize(600,100);
        errornotify.setFont(new Font("Verdand",Font.BOLD,30));
        errornotify.setBounds(100,100,600,100);
        error.add(errornotify);
    submit.addActionListener(this);
       italy.setContentPane(new JLabel(new ImageIcon("Images/Italian.jpg")));
        tag=new JLabel[listitaly.length];
        totalitaly=new int[listitaly.length];
        count=new JTextField[listitaly.length];
        for(int i=0;i<listitaly.length;i++){
            
            tag[i]=new JLabel(listitaly[i]);
            count[i]=new JTextField();
            tag[i].setText(listitaly[i]);
            tag[i].setBounds(350,100*i+50,150,50);
            tag[i].setFont(f);
            count[i].setBounds(500,100*i+50,50,30);
            count[i].setText(Integer.toString(0));
            count[i].setFont(f);
            italy.add(tag[i]);
            italy.add(count[i]);
        }
       // italy.add(b);
        submit.setOpaque(false);
        submit.setBorderPainted(false);
        submit.setFont(new Font("Verdana",Font.BOLD,20));
        submit.setBackground(new Color(247,247,237));
        submit.setBounds(250,650,400,50);
        italy.add(submit);
        
        italy.setLayout(null);
        italy.setBounds(650,0,650,919);
        italy.setVisible(true);
       // System.out.println("x");
       new ItalianItems();
        return;
    }



    public void actionPerformed(ActionEvent e) {
        int a;
        String ch=null;
        for(int i=0;i<listitaly.length;i++){
            try{
            ch=count[i].getText();
            a=Integer.parseUnsignedInt(count[i].getText());
            }
            catch(Exception E){
               if(ch!=null){
               // errornotify.setText("Enter a valid count in "+"dish"+(i+2));   
                error.setVisible(true);
                    return;
               }
               // System.out.println(E.getMessage()+"    NO text");
                a=0;
            }
            totalitaly[i]=a;
           // System.out.println("INPACKAGE"+tag[i].getText()+"->"+totalindia[i]);
        }
        // if(e.getSource()==b){
        //     for(int i=0;i<6;i++)
        //     System.out.println("Test"+tag[i].getText()+"->"+totalindia[i]);
        // }
        error.setVisible(false);
        italy.setVisible(false);
        
    }
    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     int a;
    //     for(int i=0;i<listitaly.length;i++){
    //         try{
    //         a=Integer.parseUnsignedInt(count[i].getText());
    //         }
    //         catch(Exception E){
    //            // System.out.println(E.getMessage()+"    NO text");
    //             a=0;
    //         }
    //         totalitaly[i]=a;
    //        // System.out.println("INPACKAGE"+tag[i].getText()+"->"+totalitaly[i]);
    //     }
    //     // if(e.getSource()==b){
    //     //     for(int i=0;i<6;i++)
    //     //     System.out.println("Test"+tag[i].getText()+"->"+totalitaly[i]);
    //     // }
    //     italy.setVisible(false);
        
    // }




   
}