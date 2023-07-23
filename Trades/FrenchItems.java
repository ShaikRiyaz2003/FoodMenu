package Trades;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrenchItems implements ActionListener {
    public static String [] listfrance={"French onion soup","Chicken confit","Cassoulet","Chocolate souffle","Shallots","Truffle"};
    static JTextField [] count;
    static JLabel  [] tag;
    JDialog error=new JDialog();
    JLabel errornotify=new JLabel("invalid count:( Enter a valid count");
    public int [] totalfrance=new int[6];
    static JDialog french1=new JDialog();
    static Icon sub=new ImageIcon("../Images/submit.jpg");
    static JButton submit=new JButton("ADD TO PLATE");//new ImageIcon("D:\\VSCODE\\FoodMenu\\Indian\\submit.jpg"));
    static Font f=new Font("Verdana",Font.BOLD,20);
    public void French(){
        error.setSize(600,100);
        errornotify.setFont(new Font("Verdand",Font.BOLD,30));
        errornotify.setBounds(100,100,600,100);
        error.add(errornotify);
        french1.setContentPane(new JLabel(new ImageIcon("Images/french.jpg")));
    submit.addActionListener(this);
        tag=new JLabel[6];
        totalfrance=new int[6];
        count=new JTextField[6];
        for(int i=0;i<6;i++){
            
            tag[i]=new JLabel(listfrance[i]);
            count[i]=new JTextField();
            tag[i].setText(listfrance[i]);
            tag[i].setBounds(50,100*i+50,250,50);
            tag[i].setFont(f);
            count[i].setBounds(300,100*i+50,50,30);
            count[i].setText(Integer.toString(0));
            count[i].setFont(new Font("Verdana",Font.BOLD,18));
            french1.add(tag[i]);
            french1.add(count[i]);
        }
        
        submit.setOpaque(false);
        submit.setBorderPainted(false);
        submit.setFont(new Font("Verdana",Font.BOLD,25));
        submit.setBackground(new Color(247,247,237));
        submit.setBounds(45,650,400,50);
        french1.add(submit);
        
        french1.setLayout(null);
        french1.setBounds(650,0,650,919);
        french1.setVisible(true);
        new FrenchItems();
        
        return;
    }
    public void actionPerformed(ActionEvent e) {
        int a;
        String ch=null;
        for(int i=0;i<listfrance.length;i++){
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
            totalfrance[i]=a;
           // System.out.println("INPACKAGE"+tag[i].getText()+"->"+totalindia[i]);
        }
        // if(e.getSource()==b){
        //     for(int i=0;i<6;i++)
        //     System.out.println("Test"+tag[i].getText()+"->"+totalindia[i]);
        // }
        error.setVisible(false);
        french1.setVisible(false);
        
    }
}