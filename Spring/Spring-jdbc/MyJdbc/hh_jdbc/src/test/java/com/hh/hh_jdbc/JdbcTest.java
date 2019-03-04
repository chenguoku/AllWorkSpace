package com.hh.hh_jdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.fastjson.JSON;
import com.hh.hh_jdbc.entity.User;

public class JdbcTest {

	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.190.130:3306/my_test", "root",
					"123456");
			PreparedStatement pstm = connection.prepareStatement("select * from user");
			ResultSet rs = pstm.executeQuery();
			int len = rs.getMetaData().getColumnCount();
			while (rs.next()) {

				Class clazz = User.class;
				Object user = clazz.newInstance();
				for (int i = 1; i <= len; i++) {
					String name = rs.getMetaData().getColumnName(i);
					Field field = clazz.getDeclaredField(name);
					
					field.setAccessible(true);
					Class type = field.getType();
					if (type == Integer.class) {
						field.set(user, rs.getInt(name));
					}else if (type == String.class) {
						field.set(user,rs.getString(name));
					}
					System.out.println(JSON.toJSON(user));
				}

			}
			rs.close();
			pstm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
