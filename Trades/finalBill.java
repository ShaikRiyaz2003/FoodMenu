package Trades;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
public class finalBill{
   //static String[]india={"Veg Thali","Non-Veg Thali","Veg Pulav","Masala chai","Chicken Biryani","Chapathi","Gulab Jamun"};
    static int[]indiacost={79,119,99,20,220,49,99};
    //String[] french={"French onion soup","Chicken confit","Cassoulet","Chocolate souffle","Shallots","Truffle"};
    int[]frenchcost={230,250,400,499,370,249};
    // String[] China={"Chicken hot and sour Soup","Chicken Manchurian","Chicken noodles","Chilli Chicken","Schezwan FriedRice","Spring Rolls"};
    int[]chinacost={200,160,120,140,150,75};
    //static String[] Italy={"pizza","spaghetti","carpaccio","caprese","vegetable sauce","ciabatta"};
    static int[]italycost={390,100,999,700,299,200};
    static JDialog dialog=new JDialog();
    JLabel anits=new JLabel("-----------ANITS---------------");
    JLabel thankyou=new JLabel("THANKU KEEP TRACKING ;)");
    JLabel titleitem=new JLabel("DISHES");
    JLabel titlecost=new JLabel("PRICE");
    DefaultListModel<String>namedefault=new DefaultListModel<>();
    DefaultListModel<String>costdefault=new DefaultListModel<>();
    JList<String> name=new JList<>(namedefault);
    JList<String> cost=new JList<>(costdefault);
    Double total=0.0;
    int bounds=200;
    int count=0;
    //JScrollBar scroll = new JScrollBar();
    JDialog error=new JDialog();
    JLabel errornotify=new JLabel("NO ITEMS ARE SELECTED :(");
    // GridBagLayout layout=new GridBagLayout();
    // GridBagConstraints layoutConstraints=new GridBagConstraints();
    
    int indexitem=0,indexcost=0;
    static Font f=new Font("Verdana",Font.BOLD,30);
    public  void finalb(int[] in,int[] it,int[]chi,int []fra)
    {
        errornotify.setFont(f);
        errornotify.setBackground(Color.BLUE);
        error.setBackground(Color.BLUE);
        anits.setBackground(new ColorUIResource(700));
        dialog.setContentPane(new JLabel(new ImageIcon("Images/bill.jpg")));
        //dialog.getContentPane().add(scroll);
        name.setFont(new Font("Verdana",Font.LAYOUT_LEFT_TO_RIGHT,18));
        cost.setFont(new Font("Verdana",Font.LAYOUT_LEFT_TO_RIGHT,18));
        titleitem.setFont(f);
        titlecost.setFont(f);
        titleitem.setBounds(0,0,300,50);
        titlecost.setBounds(325,0,325,50);
                //  name.setOpaque(false);
        name.setBackground(new Color(237,236,237));
        cost.setBackground(new Color(237,236,237));
        costdefault.addElement("====================");
        namedefault.addElement("====================");
        System.out.println("////////////////////////////////////////////////////////INDIAN///////////////////////////////");
        for(int i=0;i<in.length;i++)
        {
        System.out.println(IndianItems.listindia[i]+"=========>"+in[i]);
        if(in[i]!=0){
        namedefault.addElement(IndianItems.listindia[i]);
        costdefault.addElement(Integer.toString(in[i])+"X"+Integer.toString(indiacost[i])+"="+Integer.toString(indiacost[i]*in[i])+"/-");
        total+=indiacost[i]*in[i];
        bounds+=25;
        count++;
        }
        }//finall.finalBill
        System.out.println("////////////////////////////////////////////////////////china///////////////////////////////");
        for(int i=0;i<chi.length;i++){
            if(chi[i]!=0)
            {
                namedefault.addElement(ChineeseItems.listchina[i]);
                costdefault.addElement(Integer.toString(chi[i])+"X"+Integer.toString(chinacost[i])+"="+Integer.toString(chinacost[i]*chi[i])+"/-");
                total+=chinacost[i]*chi[i];
                bounds+=25;
                count++;
            }
        System.out.println(ChineeseItems.listchina[i]+"=========>"+chi[i]);}
        System.out.println("////////////////////////////////////////////////////////france///////////////////////////////");
        for(int i=0;i<fra.length;i++){
            if(fra[i]!=0)
            {
                namedefault.addElement(FrenchItems.listfrance[i]);
                costdefault.addElement(Integer.toString(fra[i])+"X"+Integer.toString(frenchcost[i])+"="+Integer.toString(frenchcost[i]*fra[i])+"/-");
                total+=frenchcost[i]*fra[i];
                bounds+=25;
                count++;
            }
        System.out.println(FrenchItems.listfrance[i]+"=========>"+fra[i]);}
        System.out.println("////////////////////////////////////////////////////////Italian///////////////////////////////");
        for(int i=0;i<it.length;i++){
        System.out.println(ItalianItems.listitaly[i]+"=========>"+it[i]);
        if(it[i]!=0){
        namedefault.addElement(ItalianItems.listitaly[i]);
        costdefault.addElement(Integer.toString(it[i])+"X"+Integer.toString(italycost[i])+"="+Integer.toString(italycost[i]*it[i])+"/-");
        total+=italycost[i]*it[i];
        bounds+=25;
        count++;
        }
    }
        namedefault.addElement("====================");
        namedefault.addElement("SUB TOTAL:");                   
        costdefault.addElement("====================");
        costdefault.addElement(String.valueOf(total)+"/-");
        namedefault.addElement("GST(4%):");
        costdefault.addElement(String.valueOf(total*0.04)+"/-");
        namedefault.addElement("TOTAL:");
        costdefault.addElement(String.valueOf(total+total*0.04)+"/-");
        thankyou.setFont(new Font("Engravers MT",Font.BOLD,35));
        anits.setFont(new Font("Engravers MT",Font.BOLD,35));
        //scroll.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //dialog.getContentPane().add(scroll);
        cost.setBackground(new Color(217,241,245));
        cost.setOpaque(false);
        name.setBackground(new Color(217,241,245));
        name.setOpaque(false);
        cost.setBounds(325,50,350,bounds);
        name.setBounds(0,50,325,bounds);
      //  scroll.add(namedefault);
       // scroll.setBounds(660,0,20,bounds+100);
        thankyou.setBounds(0,bounds,670,35);
        anits.setBounds(0,bounds+40,670,50);
       // dialog.add(scroll);
        dialog.add(anits);
        dialog.add(thankyou);
        dialog.add(titlecost);
        dialog.add(titleitem);
        dialog.add(cost);
        dialog.add(name);
        dialog.setBounds(100,200,700,bounds+150);
        dialog.setLayout(null);
        dialog.setVisible(true);
        if(count==0){
            dialog.setVisible(false);
            error.add(errornotify);
            error.setBounds(100,100,500,100);
            error.setVisible(true);
        }
        //     layout=new GridLayout(in.length+it.length,2); 
    //     dialog.setLayout(layout);
    //     itemindia=new JLabel[7];
    //     costindia=new JLabel[7];
    //     for(int i=0;i<7;i++){
    //         if(in[i]==0){
    //             continue;
    //         }
    //         itemindia[i]=new JLabel(india[i]);
    //         itemindia[i].setFont(f);
    //         dialog.add(itemindia[i]);
    //         costindia[i]=new JLabel(Integer.toString(indiacost[i]));
    //         costindia[i].setFont(f);
    //         dialog.add(costindia[i]);
    //     }
    //     itemitaly=new JLabel[7];
    //     costitaly=new JLabel[7];
    //     for(int i=0;i<6;i++){
    //         if(it[i]==0){
    //             continue;
    //         }
    //         itemitaly[i]=new JLabel(Italy[i]);
    //         itemitaly[i].setFont(f);
    //         dialog.add(itemitaly[i]);
    //         costitaly[i]=new JLabel(Integer.toString(italycost[i]));
    //         costitaly[i].setFont(f);
    //         dialog.add(costitaly[i]);
    //     }
    //     dialog.setSize(800,800);
    //     dialog.setVisible(true);
     }
    
}

// package Indian;
// import javax.swing.*;
// import Indian.pindian;
// import java.awt.*;
// import java.awt.event.*;
// import java.util.*;
// public class FinalBill {
//    GridBagLayout GridBagLayoutgrid = new GridBagLayout();  
//             GridBagConstraints gbc = new GridBagConstraints();  
//     String[]india={"Veg Thali","Non-Veg Thali","Veg Pulav","Masala chai","Chicken Biryani","Chapathi","Gulab Jamun"};
//     int[]indiacost={79,119,99,20,220,49,99};
// String[] french={"French onion soup","Chicken confit","Cassoulet","Chocolate souffle","Shallots","Truffle"};
//     int[]frenchcost={230,250,400,500,400,270};
//     String[] China={"Chicken hot and sour Soup","Chicken Manchurian","Chicken noodles","Chilli Chicken","Schezwan FriedRice","Spring Rolls"};
//     int[]chinacost={200,160,180,140,150,75};
//     String[] Italy={"pizza","spaghetti","carpaccio","caprese","penne with vegetable sauce","ciabatta"};
//     int[]italycost={500,100,1500,700,1500,200};
//     JLabel disindia[],costindia[],disfrench[];
//     JLabel costfrench[],dischina[],costchina[],disitaly[],costitaly[];
//     JLabel itemhead,costhead;
//     int actual[];
//     int count;
//     int j=0;
//     int display=0;
//     float stotal,gst,fina;
//     JDialog bill=new JDialog();
//     static Font f=new Font("Verdana",Font.BOLD,15);
//     public void finalBill(int[] indian,int[] frenchian,int[] chinese,int [] italian){
//         //////////////////////headings////////////////////////////
//         itemhead=new JLabel("ITEMS");
//         costhead=new JLabel("PRICE");
//         itemhead.setFont(f);
//         costhead.setFont(f);
//         add(itemhead);
//         add(costhead);
//         ////////////////////////////////////////Indian////////////////////////////
//         for(int i=0;i<india.length;i++)
//             if(indian[i]!=0)
//                 count++;
//         disindia=new JLabel[count];
//         costindia=new JLabel[count];
//         for(int i=0,j=0;i<indian.length&&count!=0;i++)
//         {if(indian[i]!=0)
//             {
//                 System.out.println(india[i]+" -> "+indian[i]+"==>"+indian[i]*indiacost[i]);
//                 disindia[j]=new JLabel(india[i]);
//                 costindia[j]= new JLabel(Integer.toString(indian[i]*indiacost[i]));
//                 costindia[j].setBounds(400,50*display+10,50,50);
//                 costindia[j].setFont(f);

//                 disindia[j].setBounds(100,10+display*50,200,50);
//                 disindia[j].setFont(f);
//                 bill.add(disindia[j]);
//                 bill.add(costindia[j]);
//                 display++;
//                 j++;
//             }
//         }
        
//         count=0;
// //////////////////////////////////////////////frenchian//////////////////////////////////////////
//         for(int i=0;i<french.length;i++)
//             if(frenchian[i]!=0)
//                 count++;
//         disfrench=new JLabel[count];
//         costfrench=new JLabel[count];
//         for(int i=0,j=0;i<frenchian.length&&count!=0;i++)
//         {if(indian[i]!=0)
//             {
//                 System.out.println(french[i]+" -> "+frenchian[i]+"==>"+frenchian[i]*frenchcost[i]);
//                 disfrench[j]=new JLabel(french[i]);
//                 costfrench[j]= new JLabel(Integer.toString(frenchian[i]*frenchcost[i]));
//                 costfrench[j].setBounds(400,50*display+10,50,50);
//                 costfrench[j].setFont(f); 

//                 disfrench[j].setBounds(100,10+display*50,200,50);
//                 disfrench[j].setFont(f);
//                 bill.add(disfrench[j]);
//                 bill.add(costfrench[j]);
//                 j++;
//                 display++;
//             }
//         }
//         count=0;
//         /////////////////////////chinese///////////////////////////////////////////
//         for(int i=0;i<6;i++)
//             if(chinese[i]!=0)
//                 count++;
//         dischina=new JLabel[count];
//         costchina=new JLabel[count];
//         for(int i=0,j=0;i<6&&count!=0;i++)
//         {if(chinese[i]!=0)
//             {
//                 System.out.println(China[i]+" -> "+chinese[i]+"==>"+chinese[i]*chinacost[i]);
//                 dischina[j]=new JLabel(China[i]);
//                 costchina[j]= new JLabel(Integer.toString(chinese[i]*chinacost[i]));
//                 costchina[j].setBounds(400,50*display+10,50,50);
//                 costchina[j].setFont(f);

//                 disindia[j].setBounds(100,10+display*50,200,50);
//                 disindia[j].setFont(f);
//                 bill.add(dischina[j]);
//                 bill.add(costchina[j]);
//                 j++;
//                 display++;
//             }
//         }
//         count=0;
//         /////////////////////////////////////////////////italian/Italy/italycost//////////////////////////////
//         for(int i=0;i<Italy.length;i++)
//             if(italian[i]!=0)
//                 count++;
//         disitaly=new JLabel[count];
//         costitaly=new JLabel[count];
//         for(int i=0,j=0;i<Italy.length&&count!=0;i++)
//         {if(italian[i]!=0){
//            System.out.println(Italy[i]+" -> "+italian[i]+"==>"+italian[i]*italycost[i]);
//            disitaly[j]=new JLabel(Italy[i]);
//            costitaly[j]= new JLabel(Integer.toString(italian[i]*italycost[i]));
//            costitaly[j].setBounds(400,50*display+10,50,50);
//            costitaly[j].setFont(f);

//            disitaly[j].setBounds(100,10+display*50,200,50);
//            disitaly[j].setFont(f);
//            bill.add(disitaly[j]);
//            bill.add(costitaly[j]);
//            j++;
//            display++;
//         }
//         }
        
//         bill.setBounds(650,0,650,919);
//         bill.setLayout(GridBagLayoutgrid);//new GridLayout(indian.length+frenchian.length+chinese.length+italian.length,2));
//         bill.setVisible(true);
//     }
//     private void add(JLabel itemhead2) {
//     }
// }

// // package Indian;
// // import javax.swing.*;
// // import Indian.pindian;
// // import java.awt.*;
// // import java.awt.event.*;
// // import java.util.*;
// // public class FinalBill {
// //     String[]india={"Veg Thali","Non-Veg Thali","Veg Pulav","Veg Friedrice","Chicken Biryani","Chicken Friedrice"};
// //     int[]indiacost={80,120,100,125,220,180};
// //     String[] french={"french Onion Soup","Chicken Confit","Cassoulet","Chocolate Souffle","Shallots","Truffle"};
// //     int[]frenchcost={230,250,400,500,400,270};
// //     String[] China={"Chicken Manchurian","Chicken Noodles","Chilli Chicken","Schezwan Fried Rice","Spring Rolls"};
// //     int[]chinacost={200,160,180,140,150};
// //     String[] Italy={"Napoletana Pizza","Risotto","Fiorentian Steak","Polente","Lasagne"};
// //     int[]italycost={500,100,1500,700,1500};
// //     JLabel disindia[],costindia[],disfrench[],costfrench[], dischina[],costchina[],disitaly[], costitaly[];
// //     int actual[];
// //     int count;
// //     int j=0;
// //     float stotal,gst,fina;
// //     JFrame bill=new JFrame("BILL");
// //     private int[] Chinese;
// //     static Font f=new Font("Verdana",Font.BOLD,15);
// //     public void finalBill(int[] indian,int[] frenchian,int[] chinese,int [] italian){
// //         for(int i=0;i<india.length;i++)
// //             if(indian[i]!=0)
// //                 count++;
// //         disindia=new JLabel[count];
// //         costindia=new JLabel[count];
// //         for(int i=0,j=0;i<indian.length&&count!=0;i++)
// //         {if(indian[i]!=0){
// //            System.out.println(india[i]+" -> "+indian[i]+"==>"+indian[i]*indiacost[i]);
// //            disindia[j]=new JLabel(india[i]);
// //            costindia[j]= new JLabel(Integer.toString(indian[i]*indiacost[i]));
// //            costindia[j].setBounds(400,50*i+50,50,50);
// //            costindia[j].setFont(f);

// //            disindia[j].setBounds(100,50+i*50,200,50);
// //            disindia[j].setFont(f);
// //            bill.add(disindia[j]);
// //            bill.add(costindia[j]);
// //            j++;
// //         }
        