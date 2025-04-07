package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class crud {

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
	
	String insert = "Insert into empdetail (id,name,password) value(?,?,?)";
	
	try {
		PreparedStatement ps = cn.prepareStatement(insert);
		ps.setString(2, "Chirag");
		ps.setString(3, "Chirag@123");
		
		int a = ps.executeUpdate();
		
		if(a>0) {
			System.out.println("Data inserted");
		}
	}catch(Exception e) {
		System.out.println("Data not inserted");
	}
	
	String delete = "Delete from empdetail where id=?";
	
	try {
		PreparedStatement ps = cn.prepareStatement(delete);
		ps.setInt(1, 3);
		
		int b = ps.executeUpdate();
		
		if(b>0) {
			System.out.println("Data deleted.");
		}
	}catch(Exception e) {
		System.out.println("Data not deleted.");
	}
	
	String update = "Update empdetail set name=? , password=? where id=?";
	
	try {
		PreparedStatement ps = cn.prepareStatement(update);
		ps.setString(1, "Hussain");
		ps.setString(2, "Hussain@gmail.com");
		
		ps.setInt(4, 0);
		
		int c = ps.executeUpdate();
		
		if(c>0) {
			System.out.println("Data updated");
		}
	}catch(Exception e) {
		System.out.println("Data not updated");
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
