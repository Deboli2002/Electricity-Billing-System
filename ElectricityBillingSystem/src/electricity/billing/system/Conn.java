
package electricity.billing.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        //Class.forName("com.mysql.cj.jdbc.Driver"); //Mysqldriver
        try {
        c = DriverManager.getConnection("jdbc:mysql:///ebss", "root", "Debo@2002");
        s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Conn();
    }
}
