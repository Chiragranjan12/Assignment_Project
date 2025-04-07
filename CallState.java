package jdbc;

import java.sql.*;

public class CallState {
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/assignment", "root", "");

            CallableStatement stmt = cn.prepareCall("{CALL getUserEmail(?, ?)}");
            stmt.setInt(1, 1); // IN parameter (userId)
            stmt.registerOutParameter(2, Types.VARCHAR); // OUT parameter (userEmail)

            stmt.execute();

            String email = stmt.getString(2); // get OUT value
            System.out.println("User Email: " + email);

            stmt.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

