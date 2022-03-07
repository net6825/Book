package school.java.database;

import java.sql.*;
import java.util.Scanner;

/**
 * 1번 : 추가
 * 2번 : 전체 출력
 * 3번 : 부서번호 주면 삭제
 * 4번 : 부서이름으로 검색
 */


public class jdbc_depart {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
        String user = "c##1701209";
        String pw = "p1701209";

            Scanner sc = new Scanner(System.in);
            System.out.print("무엇을 할 것인가? \n 1. 삽입 2. 조회 3. 삭제 4. 부서별 조회" );
            int keyData = sc.nextInt();
            switch (keyData) {
                case 1:  // 조회 -> 전체 books 테이블의 정보 디스플레이
                    insertDB();
                    break;
                case 2:  // 삽입 -> 사용자로부터 정보 입력받아 DB에 저장
                    display();
                    break;
                case 3:  // 삭제 -> 사용자로부터 id를 입력받아 삭제
                    deleteDB();
                    break;
                case 4: // 검색(부서번호로)
                    selectDisplay();
            }
        }

    private static void selectDisplay() {
        Connection conn = makeConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 부서 이름을 검색하세요");
        String a = sc.next();
        String sql = "select * from DEPARTMENT where dept_name="+"('"+a+"')";
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
                int dept_no = rs.getInt("dept_no");
                String dept_name = rs.getString("dept_name");
                String floor = rs.getString("floor");
                System.out.println("결과 " + dept_no+ " " + dept_name + " " + floor );

            stmt.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static Connection makeConnection () {
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

        private static void deleteDB () {
            Connection conn = makeConnection();
            try {
                System.out.println("삭제할 부서번호를 입력하시오");
                Scanner d = new Scanner(System.in);
                int a = d.nextInt();
                System.out.println(d);
                String sql = "delete from DEPARTMENT where dept_no=" + a;
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                conn.close();
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        private static void insertDB () {
            Connection conn = makeConnection();
            try {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("1. 부서번호 입력");
                int a = sc1.nextInt();
                System.out.println("2. 부서명 입력");
                String b = sc1.next();
                System.out.println("3. 층 입력");
                int c = sc1.nextInt();
                Statement stmt = conn.createStatement();
                String sql = "insert into DEPARTMENT (dept_no, dept_name, floor)" +
                        " values(" + a + ", '" + b + "', " + c + ")";
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
                String sql = "select * from DEPARTMENT";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    int dept_no = rs.getInt("dept_no");
                    String dept_name = rs.getString("dept_name");
                    String floor = rs.getString("floor");
                    System.out.println("결과 :" + dept_no + " " + dept_name + " " + floor );
                }

                conn.close();
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


