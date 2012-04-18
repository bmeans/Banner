/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *
 * @author lambert
 */
import java.sql.*;
import javax.sql.*;

/**
 *
 * @author lambert
 */
public class umwSQL {
    public static void main(String args[]){
    
    String dbtime;
String dbUrl = "jdbc:mysql://localhost/umw";
String dbClass = "com.mysql.jdbc.Driver";
String query = "Select crn, course FROM courses LIMIT 2"; //This is a test

try {

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection (dbUrl, "root", "5turtles"); //**put your password!!
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);

while (rs.next()) {
dbtime = rs.getString(1);
System.out.println(dbtime);
} //end while

con.close();
} //end try

catch(ClassNotFoundException e) {
e.printStackTrace();
}

catch(SQLException e) {
e.printStackTrace();
}
    }   
}
