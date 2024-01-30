package Task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Q2_SQL {
	
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcemployee", "root", "test");
			
			
			Statement sta = con.createStatement();
			sta.execute("INSERT INTO jdbcemployee.personalinfo3(empcode, empname, empage, esalary) VALUES ('105', 'Shameer', '25', '90000')");
				
			System.out.println("statement completed");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
