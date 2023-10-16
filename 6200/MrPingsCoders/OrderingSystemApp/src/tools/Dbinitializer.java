package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbinitializer {
	public static void initDatabase() {
        String url = "jdbc:sqlite:db.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            Statement statement = connection.createStatement();

            // 创建表
            statement.execute("CREATE TABLE IF NOT EXISTS User (id INTEGER, username TEXT)");
            System.out.println("created");
            // 在此处根据需要创建其他表

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
