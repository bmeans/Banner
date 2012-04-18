/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

import java.sql.*;

/**
 *
 * @author lambert
 */
public class Db {

private static Connection con;

public static Connection getConnection() throws Exception {
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost/umw", "root","");
return con;
}


public static void putData(String sql) throws Exception{
PreparedStatement state = getConnection().prepareStatement(sql);
state.executeUpdate();
}

public static ResultSet getData(String sql) throws Exception{
Statement states = getConnection().createStatement();
ResultSet rset = states.executeQuery(sql);
return rset;
}

} 