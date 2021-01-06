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
 
//import DateProducer.H;
 
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
 
public class MotherFrame extends JFrame{
    
    private JButton cal = new JButton("Calendar");
    private JButton tellMonth = new JButton("THE DATE");
    public String month = "Y Month";
    
    public MotherFrame(){
        super("Giant Tree Inn Operating System 1.0");
        setLayout(new FlowLayout());
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        H h = new H();
                
        cal.addActionListener(h);
        tellMonth.addActionListener(h);
        add(cal);
        add(tellMonth);
        
        
        setVisible(true);
    }
    
    private class H implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==cal){
                DateProducer dp = new DateProducer(new MotherFrame());
            }
            else if(e.getSource()==tellMonth){
                JOptionPane.showMessageDialog(new JFrame(), month);
            }
        }//end actionPerformed
    }//end H ActionListener definitions
     
    public static void main(String[]args){
        MotherFrame fm = new MotherFrame();
        
        
        
    }//end main method
    
}//end class MotherFrame
