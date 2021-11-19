/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import java.sql.*;
/**
 *
 * @author tanush
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            System.out.println("Sucessfully Connected To MySql Database");
            return con;
        }
        catch(Exception e){
            System.out.println("Cannot Connect To MySql Database");
            return null;
        }
    }
}
