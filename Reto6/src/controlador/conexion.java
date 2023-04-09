
package controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;




public class conexion {
    protected Connection con;
    protected PreparedStatement ps;
    protected ResultSet rs;
    
    String driver="com.mysql.jdbc.Driver";
    String user="root";
    String password="";
    String url ="jdbc:mysql://localhost:3306/reto5";
    
            

    public conexion() {
        try{
            Class.forName(driver);
            this.con=DriverManager.getConnection(url, user, password);
            
        }catch (HeadlessException |ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());    
            
        }
        
    }
  
    public Connection getConnection(){
        return this.con;
    }

   
        
    
    
    
    
    
    
    
                
            
            
            
            
   
        
        
        
    }
    
    
    
       
        
    

  
        
        
        
        
    
   
    
   

