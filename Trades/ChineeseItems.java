package Trades;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChineeseItems implements ActionListener {
    public static String [] listchina={"Chicken hot and sour Soup","Chicken Manchurian","Chicken noodles","Chilli Chicken","Schezwan FriedRice","Spring Rolls"};
    static JTextField [] count;
    static JLabel  [] tag;
    JDialog error=new JDialog();
    JLabel errornotify=new JLabel("invalid count:( Enter a valid count");
    public int [] totalchina=new int[6];
    static JDialog chinese;
    static JButton submit=new JButton("ADD TO PLATE");
    static Font f=new Font("Verdana",Font.BOLD,15);
   // JButton b=new JButton("hello");


    public void China(){
        error.setSize(600,100);
        errornotify.setFont(new Font("Verdand",Font.BOLD,30));
        errornotify.setBounds(100,100,600,100);
        error.add(errornotify);
        chinese =new JDialog();
        chinese.setContentPane(new JLabel(new ImageIcon("Images/chinese.jpg")));
        // b.setBounds(100,100,50,50);
       
        // b.addActionListener(this);
    submit.addActionListener(this);
      // chinese.setContentPane(new JLabel( ));
        tag=new JLabel[6];
        totalchina=new int[6];
        count=new JTextField[6];
        for(int i=0;i<6;i++){
            
            tag[i]=new JLabel(listchina[i]);
            count[i]=new JTextField();
            tag[i].setText(listchina[i]);
            tag[i].setBounds(50,100*i+50,350,50);
            tag[i].setFont(f);
            count[i].setBounds(300,100*i+50,50,30);
            count[i].setText(Integer.toString(0));
            count[i].setFont(f);
            chinese.add(tag[i]);
            chinese.add(count[i]);
        }
       // chinese.add(b);
        submit.setOpaque(false);
        submit.setBorderPainted(false);
        submit.setFont(new Font("Verdana",Font.BOLD,30));
        submit.setBackground(new Color(247,247,237));
        submit.setBounds(100,650,300,50);
        chinese.add(submit);
        
        chinese.setLayout(null);
        chinese.setBounds(707,0,650,919);
        chinese.setVisible(true);
        new ChineeseItems();
        return;
    }


    public void actionPerformed(ActionEvent e) {
        int a;
        String ch=null;
        for(int i=0;i<listchina.length;i++){
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
            totalchina[i]=a;
           // System.out.println("INPACKAGE"+tag[i].getText()+"->"+totalindia[i]);
        }
        // if(e.getSource()==b){
        //     for(int i=0;i<6;i++)
        //     System.out.println("Test"+tag[i].getText()+"->"+totalindia[i]);
        // }
        error.setVisible(false);
        chinese.setVisible(false);
        
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // //     int a;
    // //     for(int i=0;i<6;i++){
    // //         try{
    // //         a=Integer.parseUnsignedInt(count[i].getText());
    // //         }
    // //         catch(Exception E){
    // //            // System.out.println(E.getMessage()+"    NO text");
    // //             a=0;
    // //         }
    // //         totalchina[i]=a;
    // //        // System.out.println("INPACKAGE"+tag[i].getText()+"->"+totalchina[i]);
    // //     }
    // //     // if(e.getSource()==b){
    // //     //     for(int i=0;i<6;i++)
    // //     //     System.out.println("Test"+tag[i].getText()+"->"+totalchina[i]);
    // //     // }
    // //     cuisine.setVisible(false);
        
    // // }
    // int a;
    // String ch;
    //     for(int i=0;i<listchina.length;i++){
    //         try{ 
    //             if(ch!=null){
    //             // errornotify.setText("Enter a valid count in "+"dish"+(i+2));   
    //              error.setVisible(true);
    //                  return;
    //             }
    //         a=Integer.parseUnsignedInt(count[i].getText());
    //         }
    //         catch(Exception E){
    //            // System.out.println(E.getMessage()+"    NO text");
    //             a=0;
    //         }
    //         totalchina[i]=a;
    //         //System.out.println("INPACKAGE"+tag[i].getText()+"->"+totalchina[i]);
    //     }
    //     // if(e.getSource()==b){
    //     //     for(int i=0;i<6;i++)
    //     //     System.out.println("Test"+tag[i].getText()+"->"+totalchina[i]);
    //     // }
    // chinese.setVisible(false);
        
    // }




}