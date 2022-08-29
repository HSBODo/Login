package site.pointman.login;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConTest {
    @Test
    public void testConnection() {

        try (Connection con =
                     DriverManager.getConnection(
                             "jdbc:oracle:thin:@localhost:1521/xe",
                             "system",
                             "1234")) {
            System.out.println(con);
        } catch (Exception e) {

        }

    }
}