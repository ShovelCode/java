import java.sql.*;
import javax.swing.*;
public class dBConnectionAddressBook {

	Connection con;//connection string to connect database to code
	PreparedStatement ps;
	ResultSet rs;
	Statement st;
	
	public dBConnectionAddressBook()//constructor
	{
		
		try{
			String driver = ("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName(driver);//connects to database
		 String login = "jdbc:odbc:addressbook";//addressbook MS Access Database name
		 con = DriverManager.getConnection(login);	
			//Statement st = con.createStatement();
				//rs = st.executeQuery("SELECT * FROM addressbookQuery");
				System.out.println("Connected");
				}catch(SQLException sqlException)
		
		
		{
		   JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
		   System.exit(1);
		   }
		   //detect problems loading database driver
		   catch(ClassNotFoundException classNotFound)
		   {
		   JOptionPane.showMessageDialog(null, classNotFound.getMessage(), "Driver Not Found",
		   JOptionPane.ERROR_MESSAGE);
		   System.exit(1);
		   }
	}
	
	public static void main(String[] args) 
	{
	 new GUI();

	}
}
