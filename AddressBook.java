import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
 
import java.sql.*;
 
public class AddressBook extends JFrame implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public JButton newButton, saveButton, deleteButton, searchButton, 
        printButton;
    public JTextField fNameText, lNameText, address1Text, address2Text, cityText, stateText,
    zipText, phoneText, emailText;
    Connection cs;
    Statement st;
    ResultSet rs;
    
    public static void main(String[] args)
    {
        new AddressBook();
    }
    public AddressBook()
    {
        JFrame frame = new JFrame();
        setVisible(true);
        setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Book");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        
        //creates button icons
        newButton = new JButton();
        newButton.addActionListener(this);
        ImageIcon newIcon = new ImageIcon("iconimages/newicon.gif/");
        newButton.setIcon(newIcon);
        
        buttonPanel.add(newButton);
        
        saveButton = new JButton();
        ImageIcon saveIcon = new ImageIcon("iconimages/saveicon.gif/");
        saveButton.setIcon(saveIcon);
        saveButton.addActionListener(this);
        buttonPanel.add(saveButton);
        
        deleteButton = new JButton();
        ImageIcon deleteIcon = new ImageIcon("iconimages/deleteicon.gif/");
        deleteButton.setIcon(deleteIcon);
        deleteButton.addActionListener(this);
        buttonPanel.add(deleteButton);
        
        searchButton = new JButton();
        ImageIcon searchIcon = new ImageIcon("iconimages/searchicon.gif/");
        searchButton.setIcon(searchIcon);
        searchButton.addActionListener(this);
        buttonPanel.add(searchButton);
        
        printButton = new JButton();
        ImageIcon printIcon = new ImageIcon("iconimages/printicon.gif/");
        printButton.setIcon(printIcon);
        printButton.addActionListener(this);
        buttonPanel.add(printButton);
        
        contentPane.add(buttonPanel, BorderLayout.NORTH);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));
        JLabel fName = new JLabel("First Name");
        JLabel lName = new JLabel("Last Name");
        JLabel address1 = new JLabel("Address 1");
        JLabel address2 = new JLabel("Address 2");
        JLabel city = new JLabel("City");
        JLabel state = new JLabel("State");
        JLabel zip = new JLabel("Zip Code");
        JLabel phone = new JLabel("Phone");
        JLabel email = new JLabel("Email");
        
        panel.add(fName);
        fNameText = new JTextField(25);
        panel.add(fNameText);
        
        panel.add(lName);
        lNameText = new JTextField(25);
        panel.add(lNameText);
        
        panel.add(address1);
        address1Text = new JTextField(25);
        panel.add(address1Text);
        
        panel.add(address2);
        address2Text = new JTextField(25);
        panel.add(address2Text);
        
        panel.add(city);
        cityText = new JTextField(25);
        panel.add(cityText);
        
        panel.add(state);
        stateText = new JTextField(25);
        panel.add(stateText);
        
        panel.add(zip);
        zipText = new JTextField(25);
        panel.add(zipText);
        
        panel.add(phone);
        phoneText = new JTextField(25);
        panel.add(phoneText);
        
        panel.add(email);
        emailText = new JTextField(25);
        panel.add(emailText);
        
        contentPane.add(panel);
        
    
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals(newButton))
        {
            fNameText.setText("");
            lNameText.setText("");
            address1Text.setText("");
            address2Text.setText("");
            
        }
    }
    
}
