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
 
 
public class someMiniProgram extends JFrame {
 
    public someMiniProgram(){
     super("Calendar");
     setLayout(new FlowLayout());
     setSize(500,500);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
    }
    
    private class H implements ActionListener{
        public void actionPerformed(Event e){
            if(e.getSource==/*...*/){
                //algorithm;
            }
            else if (e.getSource==/*..*/){
                //algorithm;
            }
            else if(e.getSource==/*..*/){
                //algorithm;
            }
            
            
        }
    }
}
