package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqUsersAndPosts =
            "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER " +
            "FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID " +
            "GROUP BY P.USER_ID HAVING COUNT(*) > 1;\n";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultUsers = statement.executeQuery(sqUsersAndPosts);

        //Then
        int counter = 0;
        while(resultUsers.next()) {
            System.out.println(resultUsers.getString("FIRSTNAME") + ", " +
                                resultUsers.getString("LASTNAME") + ", " +
                                resultUsers.getInt("POSTS_NUMBER"));
            counter++;
        }
        resultUsers.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}