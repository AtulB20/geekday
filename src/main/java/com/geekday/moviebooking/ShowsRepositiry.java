package com.geekday.moviebooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowsRepositiry {

	public static void initialize() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute("create table shows(id varchar(50), showName varchar(50))");
            connection.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:hsqldb:mem:shows", "sa", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createShow(Shows screen) {
        Connection connection = getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("insert into shows values(?, ?)");
            ps.setString(1, screen.getId());
            ps.setString(2, screen.getShow());
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Shows getShow(String id) {
        Connection connection = getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from shows where id = ?");
            ps.setString(1, id);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Screen(resultSet.getString("id"), resultSet.getString("showName"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
