import java.sql.*;

public class P_28_ConnectDatabase {
    public static void main(String arg[]) throws SQLException {
        Connection con = P_21_ConnectDatabase.makeConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM books");
        while (rs.next()) {
            int id = rs.getInt("book_id");
            String title = rs.getString("title");
            String publisher = rs.getString("publisher");
            System.out.println(id + " " + title + " " + publisher);
        }
    }

    
}
