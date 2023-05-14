package project;
import java.sql.*;

class jdbc1 {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
            stmt = con.createStatement();
            stmt.execute("CREATE TABLE studtab1 (eno INT, ename VARCHAR(50), eage INT)");
            stmt.executeUpdate("INSERT INTO studtab VALUES (101, 'snehal', 10)");
            stmt.executeUpdate("INSERT INTO studtab VALUES (102, 'Shubham', 10)");
            System.out.println("Record inserted successfully.");
            rs = stmt.executeQuery("SELECT * FROM studtab");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace()				;
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
