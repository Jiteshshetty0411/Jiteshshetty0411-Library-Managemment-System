
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.*;


public class JavaConnect {
    Connection conn;
    
    public static Connection ConnectDB(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Library" , "root", "" );
    return conn;
   }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    
    }
    
}
