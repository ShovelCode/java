//import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
//import java.awt.event.*;

public  class GUI extends dBConnectionAddressBook 
{
	public static JButton newButton, saveButton, deleteButton, searchButton, 
		printButton;
	public static  JTextField fNameText, lNameText, address1Text, address2Text, cityText, stateText,
	zipText, phoneText, emailText;
	
	public static JFrame frame;
	public static JPanel textPanel;
	public static JPanel buttonPanel;
	
	    int personID =2;
	    String id = "";
	    String firstName = "";
		String lastName = "";
		String address1 = "";
		String address2 = "";
		String city = "";
		String state = "";
		String zipcode = "";
		String phoneNumber = "";
		String emailAddress = "";
	public GUI()
	{
	
		
		frame = new JFrame() ;
		
		final int WIDTH = 600;
		final int HEIGHT = 400;
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AddressBook");
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		buttonPanel = new JPanel();
		buttonPanel.setVisible(true);
		//creates button icons
			
		newButton = new JButton();//new entry button	
		newButton.setIcon(new ImageIcon("C:\\Users\\stephenromero\\DataBase Project\\src\\iconimages\\newicon.gif"));
		buttonPanel.add(newButton);
		newButton.setToolTipText("New");		
		saveButton = new JButton();// saves newly typed information into the database
		saveButton.setIcon(new ImageIcon("C:\\Users\\stephenromero\\DataBase Project\\src\\iconimages\\saveicon.gif"));
		buttonPanel.add(saveButton);
		saveButton.setToolTipText("Save");
		deleteButton = new JButton();//deletes a whole column of info on the databse
		deleteButton.setIcon(new ImageIcon("C:\\Users\\stephenromero\\DataBase Project\\src\\iconimages\\deleteicon.gif"));
		buttonPanel.add(deleteButton);
		deleteButton.setToolTipText("Delete");
		searchButton = new JButton();//searches for a particular instance in the database
		searchButton.setIcon(new ImageIcon("C:\\Users\\stephenromero\\DataBase Project\\src\\iconimages\\searchicon.gif"));
		buttonPanel.add(searchButton);
		searchButton.setToolTipText("Search");
		printButton = new JButton();//prints a particular instance in the database
		printButton.setIcon(new ImageIcon("C:\\Users\\stephenromero\\DataBase Project\\src\\iconimages\\printicon.gif"));
		buttonPanel.add(printButton);
		printButton.setToolTipText("Print");
	
		contentPane.add(buttonPanel, BorderLayout.NORTH);
		frame.setVisible(true);
		
		textPanel = new JPanel();
		
	
		frame.add(textPanel,BorderLayout.WEST);

		
		textPanel.setBorder(new CompoundBorder());
		textPanel.setLayout(new GridLayout(9, 2));
		JLabel fName = new JLabel("First Name");
		fName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		fName.setLabelFor(textPanel);
		JLabel lName = new JLabel("Last Name");
		lName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel address1 = new JLabel("Address 1");
		address1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel address2 = new JLabel("Address 2");
		address2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel city = new JLabel("City");
		city.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel state = new JLabel("State");
		state.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel zip = new JLabel("Zip Code");
		zip.setForeground(new Color(0, 0, 0));
		zip.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel phone = new JLabel("Phone");
		phone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel email = new JLabel("Email");
		email.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		textPanel.setVisible(true);
		
		textPanel.add(fName);
		fNameText = new JTextField(25);
		textPanel.add(fNameText);
		
		textPanel.add(lName);
		lNameText = new JTextField(25);
		textPanel.add(lNameText);
		
		textPanel.add(address1);
		address1Text = new JTextField(25);
		textPanel.add(address1Text);
		
		textPanel.add(address2);
		address2Text = new JTextField(25);
		textPanel.add(address2Text);
		
		textPanel.add(city);
		cityText = new JTextField(25);
		textPanel.add(cityText);
		
		textPanel.add(state);
		stateText = new JTextField(25);
		textPanel.add(stateText);
		
		textPanel.add(zip);
		zipText = new JTextField(25);
		textPanel.add(zipText);
		
		textPanel.add(phone);
		phoneText = new JTextField(25);
		textPanel.add(phoneText);
		
		textPanel.add(email);
		emailText = new JTextField(25);
		textPanel.add(emailText);

		
		contentPane.add(textPanel, BorderLayout.WEST);
		textPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{fName, fNameText, lName, lNameText, address1, address1Text, address2, address2Text, city, cityText, state, stateText, zip, zipText, phone, phoneText, email, emailText}));
		frame.setVisible(true);
		btnAction();
		
		}
	

	
	
	public void btnAction()
	{
		newButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
					personID++;
		            firstName = fNameText.getText();
		            lastName = lNameText.getText();
		            address1 = address1Text.getText();
		            address2 = address2Text.getText();
		            city = cityText.getText();
		            state = stateText.getText();
		            zipcode = zipText.getText();
		            phoneNumber = phoneText.getText();
		            emailAddress = emailText.getText();
		            id = Integer.toString(personID);
		        if(lastName.equals(""))
		        {
		            JOptionPane.showMessageDialog(null, "Please enter a persons name.");
		             
		        }else
		            {
		            newRecord();
		            JOptionPane.showMessageDialog(null, "Record added.");
		            clearRecord();

		            }
			}	
			
		});
		//save button action listener
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				
				
		
				  
		            firstName = fNameText.getText();
		            lastName = lNameText.getText();
		            address1 = address1Text.getText();
		            address2 = address2Text.getText();
		            city = cityText.getText();
		            state = stateText.getText();
		            zipcode = zipText.getText();
		            phoneNumber = phoneText.getText();
		            emailAddress = emailText.getText();
		            id = Integer.toString(personID);
					
                     
                if(lastName.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter a persons last name.");
                     
                }else
                    {
                	
                    updateRecord();
                    JOptionPane.showMessageDialog(null, "Record Updated.");
                    clearRecord();
                    }
	/*		
		         	if(rs==null)
					{
						
					
					rs.moveToInsertRow();//moves the cursor to a new row in the database
					//gets the new value entered in the GUI and inputs it into the database
			     	rs.updateString("firstName",firstName);
					rs.updateString("lastName",lastName);
					rs.updateString("address1",address1);
					rs.updateString("address2",address2);
					rs.updateString("city",city);
					rs.updateString("state",state);
					rs.updateString("zipcode",zipcode);
					rs.updateString("phoneNumber",phoneNumber);
					rs.updateString("emailAddress",emailAddress);
					
			        rs.insertRow();	//inserts the data into the database
					rs.close();
					st.close();
					String nameSQL = "INSERT * INTO names(firstName,lastName)values('"+firstName +"' , '" + lastName + "');";
					String addressSQL = "INSERT * INTO addresses(address1,address2,city,state,zipcode)values('"+address1 +"' , '" + address2 + "' , '" + city + "' , '" +  state + "' , '" + zipcode + "' )";
					String phoneNumberSQL = "INSERT * INTO phoneNumbers(phoneNumbers)values('" +  phoneNumber + "');";
					String emailAddressSQL = ("INSERT * INTO emailAddress(emailAddress)values('" + emailAddress + "');");
				    st=con.createStatement();
					rs = st.executeQuery(nameSQL);
					rs = st.executeQuery(addressSQL);
					rs = st.executeQuery(phoneNumberSQL);
					rs = st.executeQuery(emailAddressSQL);
					rs.next();
					
					fNameText.setText(rs.getString("firstName"));
					lNameText.setText(rs.getString("lastName"));
					address1Text.setText(rs.getString("address1"));
					address2Text.setText(rs.getString("address2"));
					cityText.setText(rs.getString("city"));
					stateText.setText(rs.getString("state"));
					zipText.setText(rs.getString("zipcode"));
					phoneText.setText(rs.getString("phoneNumber"));
					emailText.setText(rs.getString("emailAddress"));
	
				JOptionPane.showMessageDialog(null, "insertion successful","insertion successful",JOptionPane.PLAIN_MESSAGE);
					}
					
			     	else  //else statement updates a current record
					{ 

						rs.updateString("firstName",firstName);
						rs.updateString("lastName",lastName);
						rs.updateString("address1",address1);
						rs.updateString("address2",address2);
						rs.updateString("city",city);
						rs.updateString("state",state);
						rs.updateString("zipcode",zipcode);
						rs.updateString("phoneNumber",phoneNumber);
						rs.updateString("emailAddress",emailAddress);
						rs.updateRow();
						
						JOptionPane.showMessageDialog(null, "update successful","update successful",JOptionPane.PLAIN_MESSAGE);
			         	
						
					}
		            st.close();
		            rs.close();
		            */
	/*			}catch(Exception ex){
					JOptionPane.showMessageDialog(null," Data Insertion failed ","Data Insertion failed",JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Error :" + ex);
				}*/
			}
				
			
		});
		//delete button action listener
		deleteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

					 lastName = lNameText.getText();
                     
                     if(lastName.equals(""))
                     {
                         JOptionPane.showMessageDialog(null, "Please enter a persons name to delete.");
                     }else
                       {
                         deleteRecord();
                          
                         JOptionPane.showMessageDialog(null, "Record deleted.");
                       }
                    
 					
			/*		rs.deleteRow();
					st.close();
					rs.close();
					Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					rs = st.executeQuery("SELECT * FROM addressbookQuery ");
					rs.next();
					fNameText.setText(rs.getString("firstName"));
					lNameText.setText(rs.getString("lastName"));
					address1Text.setText(rs.getString("address1"));
					address2Text.setText(rs.getString("address2"));
					cityText.setText(rs.getString("city"));
					stateText.setText(rs.getString("state"));
					zipText.setText(rs.getString("zipcode"));
					phoneText.setText(rs.getString("phoneNumber"));
					emailText.setText(rs.getString("emailAddress"));
				*/	
					//JOptionPane.showMessageDialog(null,"Deletion Successful","Deletion Successful",JOptionPane.PLAIN_MESSAGE);
							
/*				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null," Data Deletion Failed ","Data Deletion Failed",JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Error :" + ex);
				}*/
			}
			
			
		});
		
		 //Search button Action Listener
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                    lastName = lNameText.getText();
                     
                if(lastName.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter the last name  of the record to search.");
                }
                else
                  {
                    if(lastName.equals(lastName))
                    searchRecord();
                  }
                                           
            }
        } );   
        
        //Print button Action Listener
        printButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event){
            PrinterJob job = PrinterJob.getPrinterJob();
                 job.setPrintable(null);
                 boolean ok = job.printDialog();
                 if (ok) {
                     try {

                         job.print();
                     } catch (PrinterException ex)
                     {
                      ex.printStackTrace();
                     }
 
                 }
            }
        } ); 
	}
	
	public void newRecord() 
	{
        
        try{
 
			//String addressQuery = "SELECT names.firstName, names.lastName, addresses.address1, addresses.address2, addresses.city, addresses.state, addresses.zipcode, phoneNumbers.phoneNumber, emailAddresses.emailAddressFROM (([names] INNER JOIN phoneNumbers ON names.personID = phoneNumbers.personID) INNER JOIN emailAddresses ON names.personID = emailAddresses.personID) INNER JOIN addresses ON names.personID = addresses.personID; ";
	     	//rs = st.executeQuery(addressQuery);
       	  //  String driver = ("sun.jdbc.odbc.JdbcOdbcDriver");
			//Class.forName(driver).newInstance();;//connects to database
           	 Connection con = DriverManager.getConnection("jdbc:odbc:addressbook");
            //load database driver class
        	 st = con.createStatement();
            //connect to database
			//gets the new value entered in the GUI and inputs it into the database
            //write to database	
            st.executeUpdate("INSERT  into names values(\'" + id + "\', \'" + firstName + "\' , \'" + lastName + "\')"); 
            st.executeUpdate("INSERT  into addresses values (\'" + id + "\', \'" + address1 + "\', \'" + address2 + "\', \'" + city + "\', \'" + state + "\', \'" + zipcode + "\')");
            st.executeUpdate("INSERT  into phoneNumbers values (\'" + id + "\', \'" + phoneNumber + "\')");
            st.executeUpdate("INSERT  into emailAddresses values (\'" + id + "\', \'" + emailAddress + "\')");
            //close statement and connection
            st.close();
            con.close();
        }//end try
 
        //detect problems interacting with the database
        catch (SQLException sqlException){
            JOptionPane.showMessageDialog(null,
            sqlException.getMessage(), "Database Error",
            JOptionPane.ERROR_MESSAGE);
            System.exit(1);
             
        }
 
    }//end Database NewPerson constructor
	
	public void updateRecord()
	{
	     
	    try{
	    	String driver = ("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName(driver);//connects to database
	        Connection con= DriverManager.getConnection("jdbc:odbc:addressbook");
	        String se = "Select personID from names where lastName=?";
	        PreparedStatement ps = con.prepareStatement(se);
	        ps.setString(1, lNameText.getText());
	        ResultSet rs = ps.executeQuery();
	        rs.next();
	        String personid = rs.getString("personID");
	        String s1 = "UPDATE names set firstName=? where personid=?";
	        PreparedStatement ps1 = con.prepareStatement(s1);
	        ps1.setString(1, fNameText.getText());
	        ps1.setString(2, personid);
	        String s2 = "UPDATE addresses set address1 = ?, address2 = ?, city = ?, state = ?, zipcode = ? where personid = ?";
	        PreparedStatement ps2 = con.prepareStatement(s2);
	        ps2.setString(1, address1Text.getText());
	        ps2.setString(2, address2Text.getText());
	        ps2.setString(3, cityText.getText());
	        ps2.setString(4, stateText.getText());
	        ps2.setString(5, zipText.getText());
	        ps2.setString(6, personid);
	         
	        String s3 = "UPDATE phoneNumbers set phoneNumber = ? where personid = ?";
	        PreparedStatement ps3 = con.prepareStatement(s3);
	        ps3.setString(1, phoneText.getText());
	        ps3.setString(2, personid);
	        String s4 = "UPDATE emailAddresses set emailAddress = ? where personid = ?";
	        PreparedStatement ps4 = con.prepareStatement(s4);
	        ps4.setString(1, emailText.getText());
	        ps4.setString(2, personid);
	        ps1.execute();
	        ps2.execute();
	        ps3.execute();
	        ps4.execute();
	         
	        rs.close();
	        ps1.close();
	        ps2.close();
	        ps3.close();
	        ps4.close();
	       
	        
	    } 
	        catch (SQLException | ClassNotFoundException sqlException){
	            sqlException.printStackTrace();
	            JOptionPane.showMessageDialog(null,
	            sqlException.getMessage(), "Database Error",
	            JOptionPane.ERROR_MESSAGE);
	            System.exit(1);     
	        }
	     
	    }//end Database NewPerson constructor
	
	
	public void deleteRecord()
	{
	     
	    try{
	        //load database driver class
	        //connect to database
	    	String driver = ("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName(driver);//connects to database
	        Connection con = DriverManager.getConnection("jdbc:odbc:addressbook");
	        //create Statement to query database
	        Statement st = con.createStatement();
	        //write to database
	        st.executeUpdate("DELETE from names WHERE lastName = (\'" + lastName + "\')");
	         
	        //close statement and connection
	        st.close();
	        con.close();
	         
	    }//end try
	 
	    //detect problems interacting with the database
	    catch (SQLException | ClassNotFoundException sqlException){
	        JOptionPane.showMessageDialog(null,
	        sqlException.getMessage(), "Database Error",
	        JOptionPane.ERROR_MESSAGE);
	        System.exit(1);
	         
	    }
	 
	}//end Database DeletePerson constructor
	 
	
	public void searchRecord(){
	     
        try{
        //load database driver class
        //connect to database
        Connection con = DriverManager.getConnection("jdbc:odbc:addressbook");
        //create Statement to query database
        //Statement statement = connection.createStatement();
         
        //query database
         
        String query = "SELECT * FROM names, addresses, emailAddresses, phoneNumbers WHERE LastName = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,  lastName.toString() );
        ResultSet rs = ps.executeQuery();
         
        if(rs.next())
        {
            fNameText.setText(rs.getString("firstName"));
            lNameText.setText(rs.getString("lastName"));
            address1Text.setText(rs.getString("address1"));
            address2Text.setText(rs.getString("address2"));
            cityText.setText(rs.getString("city"));
            stateText.setText(rs.getString("state"));
            zipText.setText(rs.getString("zipcode"));
            phoneText.setText(rs.getString("phoneNumber"));
            emailText.setText(rs.getString("emailAddress"));
 
        }
             
        //close statement and connection
        //statement.close();
        con.close();
         
    }//end try
 
    //detect problems interacting with the database
    catch (SQLException sqlException){
        JOptionPane.showMessageDialog(null,
        sqlException.getMessage(), "Database Error",
        JOptionPane.ERROR_MESSAGE);
        System.exit(1);
         
    }
         
}//end Database searchPerson constructor
 
	
	public void clearRecord()//method automatically inputs the first record from the database in the GUI
	{
		try
		{
			fNameText.setText("");
		    lNameText.setText("");
		    address1Text.setText("");
		    address2Text.setText("");
		    cityText.setText("");
		    stateText.setText("");
		    zipText.setText("");
		    phoneText.setText("");
		    emailText.setText(""); 
		}catch(Exception ex){
			
		}
		
	}

}
