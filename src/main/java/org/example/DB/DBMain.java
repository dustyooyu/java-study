package org.example.DB;

import java.sql.*;

public class DBMain {

    public static void main(String[] args) {
        getCodeName();
        initPerson();
    }

    private static void initPerson() {
        Connection conn = null;
        Statement smt = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            // create a database connection
            conn = DriverManager.getConnection("jdbc:sqlite:world.db");
            smt = conn.createStatement();
            smt.setQueryTimeout(30);  // set timeout to 30 sec.

            smt.executeUpdate("drop table if exists person");
            smt.executeUpdate("create table person (id integer, name string)");
            smt.executeUpdate("insert into person values(1, 'leo')");
            smt.executeUpdate("insert into person values(2, 'yui')");
            rs = smt.executeQuery("select * from person");
            while (rs.next()) {
                // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (smt != null) smt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (psmt != null) psmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void getCodeName() {
        String sql = "select code, name from country order by code, name";

        // 사용할 자원 선언
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;


        try {
            conn = DriverManager.getConnection("jdbc:sqlite:world.db");
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(("code")) + " ");
                System.out.println(rs.getString(("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally { // 자원이 존재한다면 전부 해제할 것
            try {
                if (rs != null) rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (psmt != null) psmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

