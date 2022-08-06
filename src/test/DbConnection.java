package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");
		Statement stm = con.createStatement();
		
		ResultSet result = stm.executeQuery("select * from eproduct");
		
		while(result.next()) {
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("name"));
					
			
		}
		
	}

}
