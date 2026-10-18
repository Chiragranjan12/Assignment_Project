package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectandfetch {

	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("Driver not found.");
		}
		
		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost/assignment" , "root" , "");
			
			}catch(Exception e) {
				System.out.println("Connection not found" + e.getMessage());
			}
		
		String fetch = "Select * from empdetail";
		
		Statement smt = null;
		try {
			smt = cn.createStatement();
		}catch(Exception e) {
			System.out.println("Statement not found");
		}
		
		try {
			ResultSet rs = smt.executeQuery(fetch);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+ rs.getString(3));
			}
		}catch(Exception e) {
			System.out.println("Data not fetch");
		}
	}
}
