package school.java.database;

import java.sql.*;
import java.util.Scanner;

public class Wdb {
    String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
    String user = "c##1701209";
    String pw = "p1701209";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("무엇을 할 것인가? \n 1. 조회 2. 삽입 3. 삭제");
        int keyData = sc.nextInt();
        switch (keyData) {
            case 1:  // 조회 -> 전체 books 테이블의 정보 디스플레이
                display();
                break;
            case 2:  // 삽입 -> 사용자로부터 정보 입력받아 DB에 저장
                insertDB();
                break;
            case 3:  // 삭제 -> 사용자로부터 id를 입력받아 삭제
                deleteDB();
                break;
        }
    }

    private static Connection makeConnection() {
        String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
        String user = "c##1701209";
        String pw = "p1701209";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("드라이버 로딩 성공");

        Connection conn;
        try {
            conn = DriverManager.getConnection(url, user, pw);
            return conn;
        } catch (SQLException E) {
            E.printStackTrace();
        }
        return null;
    }

    private static void deleteDB() {
        Connection conn = makeConnection();
        try {
            System.out.println("삭제할 book_id를 입력하세요");
            Scanner d = new Scanner(System.in);
            int a = d.nextInt();
            System.out.println(d);
            String sql = "delete from books where BOOK_ID="+a;
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void insertDB() {
        Connection conn = makeConnection();
        try {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("1. bookid 입력값을 넣으시오");
            int a = sc1.nextInt();
            System.out.println("2. title 입력값을 넣으시오");
            String b = sc1.next();
            System.out.println("3. publisher 입력값을 넣으시오");
            String c = sc1.next();
            System.out.println("4. year 입력값을 넣으시오");
            String d = sc1.next();
            System.out.println("5. price 입력값을 넣으시오");
            int e = sc1.nextInt();
            System.out.println();
            Statement stmt = conn.createStatement();
            String sql = "insert into books (book_id, title, publisher, year, price)" +
                    " values(" + a + ", '" +  b + "', '" + c + "', '" + d + "', '" + e +"')";
            int result = stmt.executeUpdate(sql);
            System.out.println(result);

            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void display() {
        Connection conn = makeConnection();
        try (Statement stmt = conn.createStatement()) {
            String sql = "select * from books";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("book_id");
                String title = rs.getString("title");
                String publisher = rs.getString("publisher");
                String year = rs.getString("year");
                String price = rs.getString("price");
                System.out.println("결과 " + id + " " + title + " " + publisher + " " + year + " " + price);
            }

            conn.close();
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
