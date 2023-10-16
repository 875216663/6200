package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tools.DatabaseConnector;

public class DatabaseController {
	public void createTable() {
        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS your_table_name (column1 INTEGER, column2 TEXT)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadDataFromDatabase() {
        
    }
}