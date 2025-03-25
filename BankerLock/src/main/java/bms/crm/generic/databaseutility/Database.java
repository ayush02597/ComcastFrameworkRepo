package bms.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Database {
	Connection con;

	public void getdbconnection(String url, String user, String pwd) throws SQLException {
		Driver driver = new Driver();
		try {
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con = DriverManager.getConnection(url, user, pwd);
	}

	public void getdbconnection() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeConnection() throws SQLException {
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public ResultSet executeSelectQuery(String query) throws Throwable {

		ResultSet result = null;
		try {
			Statement stat = con.createStatement();

			result = stat.executeQuery(query);
		} catch (Exception e) {

		}
		return result;

	}

	public int executeNonSelectQuery(String query) {
		int result = 0;
		try {
			Statement stat = con.createStatement();

			result = stat.executeUpdate(query);
		} catch (Exception e) {
		}
		return result;

	}

}
