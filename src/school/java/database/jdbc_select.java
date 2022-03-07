package school.java.database;

import java.sql.*;

public class jdbc_select {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
        String user = "c##1701209";
        String pw = "p1701209";

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
            ResultSet rs = stmt.executeQuery(sql);      // query문은 ResultSet으로 query의 제일
            // ResultSet 결과 집합에서 .next()는 첫번재 행으로 이동시켜 주는것
            // 4. 결과집합 사용후 연결해제

            while (rs.next()) {
                int id = rs.getInt("book_id");
                String title = rs.getString("title");
                String publisher = rs.getString("publisher");
                String year = rs.getString("year");
                String price = rs.getString("price");
                System.out.println("결과 " + id + " " + title + " " + publisher + " " + year + " " + price);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
