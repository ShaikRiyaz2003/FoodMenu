package Indian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pindian  implements ActionListener {
    public static String [] listindia={"Veg Thali","Non-Veg Thali","Veg Pulav","Masala chai","Chicken Biryani","Chapathi","Gulab Jamun"};
    static JTextField [] count;
    static JLabel  [] tag;
    JDialog error=new JDialog();
    JLabel errornotify=new JLabel("invalid count:( Enter a valid count");
    public int [] totalindia= new int[7];
    static JDialog bharat=new JDialog();
    static JButton submit=new JButton("ADD TO PLATE");
    static Font f=new Font("Verdana",Font.BOLD,15);
   // JButton b=new JButton("hello");

    public void India(){
        error.setSize(600,100);
        errornotify.setFont(new Font("Verdand",Font.BOLD,30));
        errornotify.setBounds(100,100,600,100);
        error.add(errornotify);
        // b.setBounds(100,100,50,50);
        
        // b.addActionListener(this);
    submit.addActionListener(this);
       bharat.setContentPane(new JLabel(new ImageIcon("D:\\VSCODE\\FoodMenu\\pindain.jpg")));
        tag=new JLabel[listindia.length];
        totalindia=new int[listindia.length];
        count=new JTextField[listindia.length];
        for(int i=0;i<listindia.length;i++){
            
            tag[i]=new JLabel(listindia[i]);
            count[i]=new JTextField();
            tag[i].setText(listindia[i]);
            tag[i].setBounds(350,100*i+50,150,50);
            tag[i].setFont(f);
            count[i].setBounds(500,100*i+50,50,30);
            count[i].setText(Integer.toString(0));
            count[i].setFont(f);
            bharat.add(tag[i]);
            bharat.add(count[i]);
        }
       // bharat.add(b);
        submit.setOpaque(false);
        submit.setBorderPainted(false);
        submit.setFont(new Font("Verdana",Font.BOLD,20));
        submit.setBackground(new Color(247,247,237));
        submit.setBounds(250,700,400,50);
        bharat.add(submit);
        
        bharat.setLayout(null);
        bharat.setBounds(650,0,650,919);
        bharat.setVisible(true);
       // System.out.println("x");
        new pindian();
        //System.out.println("This is pradeep's india");
        return;
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        int a;
        String ch=null;
        for(int i=0;i<listindia.length;i++){
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
            totalindia[i]=a;
           // System.out.println("INPACKAGE"+tag[i].getText()+"->"+totalindia[i]);
        }
        // if(e.getSource()==b){
        //     for(int i=0;i<6;i++)
        //     System.out.println("Test"+tag[i].getText()+"->"+totalindia[i]);
        // }
        error.setVisible(false);
        bharat.setVisible(false);
        
    }
    // public static int[] India() {
    //     System.out.println("x");
    //     pindian p=new pindian();
    //     System.out.println("This is pradeep's india");
    //     for(int i=0;i<6;i++)
    //     System.out.println(totalindia[i]);
    //     return totalindia;
    // }
    
}
