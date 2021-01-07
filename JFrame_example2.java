import java.util.*;
import java.lang.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
 
 
public class DateProducer extends JFrame {
    
    public int dateNumber = 0;
    
    private JButton day1 = new JButton("1");
    private JButton day2 = new JButton("2");
    private JButton day3 = new JButton("3");
    private JButton day4 = new JButton("4");
    private JButton day5 = new JButton("5");
    private JButton day6 = new JButton("6");
    private JButton day7 = new JButton("7");
    private JButton day8 = new JButton("8");
    private JButton day9 = new JButton("9");
    private JButton day10 = new JButton("10");
    private JButton day11 = new JButton("11");
    private JButton day12 = new JButton("12");
    private JButton day13 = new JButton("13");
    private JButton day14 = new JButton("14");
    private JButton day15 = new JButton("15");
    private JButton day16 = new JButton("16");
    private JButton day17 = new JButton("17");
    private JButton day18 = new JButton("18");
    private JButton day19 = new JButton("19");
    private JButton day20 = new JButton("20");
    private JButton day21 = new JButton("21");
    private JButton day22 = new JButton("22");
    private JButton day23 = new JButton("23");
    private JButton day24 = new JButton("24");
    private JButton day25 = new JButton("25");
    private JButton day26 = new JButton("26");
    private JButton day27 = new JButton("27");
    private JButton day28 = new JButton("28");
    private JButton day29 = new JButton("29");
    private JButton day30 = new JButton("30");
    private JButton day31 = new JButton("31");
 
    public DateProducer(){
     super("Calendar");
     setLayout(new FlowLayout());
     setSize(500,400);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     H h = new H();
     
     day1.addActionListener(h);
     day2.addActionListener(h);
     day3.addActionListener(h);
     day4.addActionListener(h);
     day6.addActionListener(h);
     day7.addActionListener(h);
     day8.addActionListener(h);
     day9.addActionListener(h);
     day10.addActionListener(h);
     day11.addActionListener(h);
     day12.addActionListener(h);
     day13.addActionListener(h);
     day14.addActionListener(h);
     day15.addActionListener(h);
     day16.addActionListener(h);
     day17.addActionListener(h);
     day18.addActionListener(h);
     day19.addActionListener(h);
     day20.addActionListener(h);
     day21.addActionListener(h);
     day22.addActionListener(h);
     day23.addActionListener(h);
     day24.addActionListener(h);
     day25.addActionListener(h);
     day26.addActionListener(h);
     day27.addActionListener(h);
     day28.addActionListener(h);
     day29.addActionListener(h);
     day30.addActionListener(h);
     day31.addActionListener(h);
     
     add(day1);
     add(day2);
     add(day3);
     add(day4);
     add(day5);
     add(day6);
     add(day7);
     add(day8);
     add(day9);
     add(day10);
     add(day11);
     add(day12);
     add(day13);
     add(day14);
     add(day15);
     add(day16);
     add(day17);
     add(day18);
     add(day19);
     add(day20);
     add(day21);
     add(day22);
     add(day23);
     add(day24);
     add(day25);
     add(day26);
     add(day27);
     add(day28);
     add(day29);
     add(day30);
     add(day31);
     
     setVisible(true);
    }
    
    private class H implements ActionListener{
        public void actionPerformed(ActionEvent e){
        
        
            if(e.getSource==day1){
                dateNumber = 1;
            }
            else if (e.getSource==day2){
                dateNumber = 2;
            }
            else if(e.getSource==day3){
                dateNumber = 3;
            }
            else{
                dateNumber = 1000;
                
            }
        
            
            
        }
    }
    
        
}
