package view;

import java.awt.Font;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Utils {
    public static String getValue(String msg){
        System.out.println(msg);
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    
    public static JLabel frameDisplay(String msg){
        JLabel label = new JLabel("<html><body><pre>" + msg);
        label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, label.getFont().getSize()));       
        return label;
    }
}