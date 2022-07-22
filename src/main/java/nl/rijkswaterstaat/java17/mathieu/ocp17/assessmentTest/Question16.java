package nl.rijkswaterstaat.java17.mathieu.ocp17.assessmentTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Question16 {
    public static void main(String[] args) throws SQLException {
        Connection conn= DriverManager.getConnection(" ");
        var sql = " Insert into PEOPLE VALUES(?,?,?)";
        conn.setAutoCommit(false);

        try(var ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
            ps.setInt(1,1);
            ps.setString(2, "Joslyn" );
            ps.setString(3,"NY");
            ps.executeUpdate();

            Savepoint sp = conn.setSavepoint();

            ps.setInt(1,2);
            ps.setString(2," Kara");
            ps.executeUpdate();


        }
    }
}
