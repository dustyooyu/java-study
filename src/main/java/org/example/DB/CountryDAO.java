package org.example.DB;

import java.sql.SQLException;

public class CountryDAO extends BaseDAO{
    public void getCodeName() {
        String sql = "select code, name from country";

        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(("code")) + " ");
                System.out.println(rs.getString(("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally { // 자원이 존재한다면 전부 해제할 것
            close();
        }
    }
}
