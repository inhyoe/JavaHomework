import java.sql.*;
import java.sql.Connection;

public class P_29_SQLisertTest {
    public static void main(String[] args) {
        addBook("Artificial Intellegnce", "Addison Wesley", "2002", 39000);
    }

    private static void addBook(String title, String publisher, String year, int price) {
        Connection con = makeConnection();
        try {
            Statement stmt = con.createStatement();
            String s = "INSERT INTO books (title, publisher, year, price) VALUES ";
            s += "('" + title + "','" + publisher + "','" + year + "','"
                    + price + "')";
            System.out.println(s);
            int i = stmt.executeUpdate(s); /* 성공 실패를 나타냄. */
            System.out.println("i 는 :"+i);
            if (i == 1)
                System.out.println("레코드 추가 성공");
            else
                System.out.println("레코드 추가 실패");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    private static void deleteBook(String title, String publisher, String year, int price) {
        Connection con = makeConnection();
        try {
            Statement stmt = con.createStatement();
            String s = "Delete from (title, publisher, year, price) VALUES ";
            s += "('" + title + "','" + publisher + "','" + year + "','"
                    + price + "')";
            System.out.println(s);
            int i = stmt.executeUpdate(s); /* 성공 실패를 나타냄. */
            System.out.println("i 는 :"+i);
            if (i == 1)
                System.out.println("레코드 추가 성공");
            else
                System.out.println("레코드 추가 실패");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static Connection makeConnection() {
        String url = "jdbc:mysql://localhost:3306/java";
        /* 로컬호스트 / 들어갈 user이름 */
        String id = "root";
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
