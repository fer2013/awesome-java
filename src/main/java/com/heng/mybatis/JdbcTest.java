package com.heng.mybatis;


import java.sql.*;


public class JdbcTest {


    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            //1、加载JDBC驱动类
            Class.forName("com.mysql.jdbc.Driver");
            //2、创建mysql连接
            connection = DriverManager.getConnection("jdbc:mysql://120.26.53.133:3306/test_01?characterEncoding=utf-8&useSSL=false", "root", "root");

            //3、获取预处理的statement
            String sql = "select * from user";
            statement = connection.prepareStatement(sql);

            //4、向数据库发出sql查询
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                System.out.println("id=" + id + ",username=" + username);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


        }

    }
}
