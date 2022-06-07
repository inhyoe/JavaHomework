import java.sql.*;

public class P_28_ConnectDatabase {
    public static void main(String arg[]) throws SQLException {
        Connection con = makeConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM books");
        while (rs.next()) {
            int id = rs.getInt("book_id");
            String title = rs.getString("title");
            System.out.println(id + " " + title);
        }
    }

    

    public static Connection makeConnection() {
        String url = "jdbc:mysql://localhost:3306/java";
                                    /* 로컬호스트 / 들어갈 user이름 */
        String id = "root";
        String username = "Java";
        String password = "Ryutlgja%%66";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("드라이버 적재 성공");
            con = DriverManager.getConnection(url, id, password);
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("연결에 실패하였습니다.");
        }
        return con;
    }

}
