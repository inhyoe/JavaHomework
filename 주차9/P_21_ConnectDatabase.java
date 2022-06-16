import java.sql.*;

import javax.naming.MalformedLinkException;

public class P_21_ConnectDatabase {
    public static Connection makeConnection() {
        String url = "jdbc:mysql://localhost:3306/Java";
        String id = "root";
        String password = "Ryutlgja%%66";
        Connection con = null;
        /* 새로운 자료형 */

        try {
            Class.forName("com.mysql.jdbc.Driver");
            /* java의 mysql클래스 */
            System.out.println("드라이버 적재 성공");
            con = DriverManager.getConnection(url, id, password);
            
            System.out.println("데이터베이스 연결 성공");

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("연결에 실패하였습니다.");
        }
        ;
        return con;
    }
    

    public static void main(String[] args) throws SQLException{
        Connection con = makeConnection();
    }
}