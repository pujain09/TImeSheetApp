package com.sample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			
			Class.forName(DataBaseSingleton.getInstance().getProperties(
					"JDBC_DRIVER"));
			conn = DriverManager.getConnection(DataBaseSingleton.getInstance()
					.getProperties("DB_URL"), DataBaseSingleton.getInstance()
					.getProperties("USER"), DataBaseSingleton.getInstance()
					.getProperties("PASS"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

}
