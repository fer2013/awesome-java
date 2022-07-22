package com.heng.mybatis;


import java.sql.*;


public class JdbcTest {


    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 通过驱动管理类获取数据库链接
            connection = DriverManager.getConnection("jdbc:mysql://120.26.53.23:3306/test_01?characterEncoding=utf-8&useSSL=false", "root", "root");
            // 定义sql语句?表示占位符
            String sql = "select * from user where username = ?";
            // 获取预处理statement
            preparedStatement = connection.prepareStatement(sql);
            // 设置参数，第一个参数为sql语句中参数的序号(从1开始)，第二个参数为设置的参数值
            preparedStatement.setString(1, "tom");
            // 向数据库发出sql执行查询，查询出结果集
            resultSet = preparedStatement.executeQuery(); // 遍历查询结果集
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                System.out.println("id = " + id + ",username = " + username);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 释放资源
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
