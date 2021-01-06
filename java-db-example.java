import java.sql.*;
public class test1
{
public static void main(String[] args) {
String url = "jdbc:odbc:JavaCourse";
String query = "select Account, Surname, Firstname from Customer";
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con =DriverManager.getConnection(url, "","");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);
while (rs.next())
{
System.out.println("Account No: " + rs.getString(1));
System.out.println("Surname: " + rs.getString(2));
System.out.println("First Name: " + rs.getString(3));
}
}
catch(SQLException ex)
{
while (ex!=null)
{
System.out.println ("SQL Exception: " + ex.getMessage ());
ex = ex.getNextException();
}
}
catch(java.lang.Exception ex)
{
ex.printStackTrace();
}
 
}
}
