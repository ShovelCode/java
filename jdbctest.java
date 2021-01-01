/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 *
 * @author FON
 */
public class JDBCTest2 {
    //klasa za dodavanje novih odeljenja 
    
    public static void dodajOdeljenje(int sifra, String naziv, String grad){
     String url ="jdbc:oracle:thin:@localhost:1521:orcl"; //nas konekcioni string 
    //? oznacava placeholder u kome cemo naknadno ubaciti vrednost 
    String upit = "insert into odeljenje values(?,?,?)";
    //razlika izmedju PreparedStatement i Statement, PS jednom iskompajlira upit  a 100 puta postavi vr dok Statement 100 puta kompajlira
    //i ovim sprecavamo napad SQLInjection
    
    
    
    try(Connection conn = DriverManager.getConnection(url,"student","student"); 
            PreparedStatement ps = conn.prepareStatement(upit);   
            ) {
   
        //Sada commit da izvrsiomo ali prvo moramo da iskljucimo autocommit koji posle svake narebde automatski radi commit
    conn.setAutoCommit(false);
    ps.setInt(1, sifra); //na prvi ?  postavi sifru itd
    ps.setString(2, naziv);
    ps.setString(3, grad);
    //da li je uspesno ili ne?
    
    int br = ps.executeUpdate(); //vraca br redova koji su ili ubaceni ili izmenjeni ili obrisani 
    
 
    if(br > 0) {
    conn.commit();   
    } else 
        conn.rollback(); //ako nista nije ubaceno da ponisitimo transakciju
    
    
    
    
        
        
        //ovaj exception jer uglavnom sve ove bacaju isti 
    }catch(SQLException e){
    e.printStackTrace();
    }
    
    }
    
    
    public static void main(String[] args) {
         dodajOdeljenje(567, "C6", "Beograd");
    }
    
    
    
}
