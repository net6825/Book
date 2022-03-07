package school.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) {
        String url="jdbc:oracle:thin:@10.30.3.95:1521:orcl";
        String user="c##1701209";
        String pw="p1701209";

        //1. JDBC 드라이버 적재
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("드라이버 로딩 성공");
        //2. 데이터베이스 연결
        try {
            Connection conn = DriverManager.getConnection(url, user, pw);
        //3. SQL문장 작성 및 전송
            Statement stmt = conn.createStatement();
            String sql = "select * from books";
            int result = stmt.executeUpdate(sql);
            System.out.println("결과 값은" + result);
        //4. 결과집합 사용후 연결해제
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
