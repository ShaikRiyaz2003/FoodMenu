import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import Trades.*;
public class Menu extends JDialog implements ActionListener{
    Scanner sc=new Scanner(System.in);
    JButton I,F,IT,C,Bill;
    JLabel back;
    IndianItems indianmenu=new IndianItems();
    Trades.ChineeseItems chinamenu=new ChineeseItems();
    ItalianItems italymenu=new ItalianItems();
    FrenchItems frenchmenu=new FrenchItems();
    finalBill finall=new finalBill();
    IndianItems pradeep=new IndianItems();
    Color c = new Color(230, 212, 183);
    Font f=new Font("Verdana",Font.BOLD,35);
    Menu(){
        setContentPane(new JLabel(new ImageIcon("Images/Main.jpg")));
        I=new JButton("INDIAN");
        F=new JButton("FRENCH");
        IT=new JButton("ITALIAN");
        C=new JButton("CHINESE");
        Bill=new JButton("BILL");
        Bill.setBounds(100,600,400,50);
        I.setBounds(100,200,400,50);
        F.setBounds(100,300,400,50);
        IT.setBounds(100,400,400,50);
        C.setBounds(100,500,400,50);
        Bill.setBackground(c);
        I.setBackground(c);
        
        F.setBackground(c);
        IT.setBackground(c);
        C.setBackground(c);
        Bill.setBorderPainted(false);
        Bill.setOpaque(false);
        Bill.setFont(f);
        I.setBorderPainted(false);
        I.setOpaque(false);
        IT.setBorderPainted(false);
        IT.setOpaque(false);
        C.setBorderPainted(false);
        C.setOpaque(false);
        F.setBorderPainted(false);
        F.setOpaque(false);
        I.setFont(f);
        IT.setFont(f);
        F.setFont(f);
        C.setFont(f);
        F.addActionListener((java.awt.event.ActionListener) this);
        C.addActionListener((java.awt.event.ActionListener) this);
        I.addActionListener((java.awt.event.ActionListener) this);
        IT.addActionListener((java.awt.event.ActionListener) this);
        Bill.addActionListener(this);
        add(Bill);
        add(I);
        add(C);
        add(F);
        add(IT);
        setSize(650,919);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        setVisible(rootPaneCheckingEnabled);
    if( e.getSource()==IT){
        italymenu.Italian();
        System.out.println("ITALIAN");
    }
    if(e.getSource()==I){
        indianmenu.India();
        System.out.println("INDIAN");
        }
    if( e.getSource()==F){
        System.out.println("FRENCH");
        frenchmenu.French();
    }
    if( e.getSource()==C){
    System.out.println("CHINESE");
        chinamenu.China();
    }
    setVisible(true);
    if(e.getSource()==Bill){
        setVisible(false);
        finall.finalb(indianmenu.totalindia,italymenu.totalitaly,chinamenu.totalchina,frenchmenu.totalfrance);
    }
    }
    public static void main(String[]args){
        new Menu();
    }
}