package sam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class week13_DBdemo {
	private final String userName = "root";
	private final String password = "";
	private final String serverName = "localhost";
	private final int portNumber = 3306;
	private final String dbName = "test";
	private final String tableName = "JDBC_TEST";

	// to get database connection
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", this.userName);
		connectionProps.put("", this.password);
		conn = DriverManager.getConnection(
				"jdbc:mysql://" + this.serverName + ":" + this.portNumber + "/" + this.dbName, connectionProps);
		return conn;
	}

	// to execute sql commands
	public boolean executeUpdate(Connection conn, String command) throws SQLException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(command);// This will throw a SQLException if it
										// fails
			return true;
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	// Connect to MySQL and do some stuff.
	public void run() {
		Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connection to DataBase");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not connect to the Database");
			e.printStackTrace();
			return;
		}
	}

	{////////
		// Create a table
		try {
			String createString = "CREATE TABLE " + this.tableName + " ( " + "ID INTEGER NOT NULL, "
					+ "NAME varchar(40) NOT NULL, " + "STREET varchar(40) NOT NULL, " + "CITY varchar(20) NOT NULL, "
					+ "STATE char(2) NOT NULL, " + "ZIP char(5), " + "PRIMARY KEY (ID))";
			this.executeUpdate(conn, createString);
			System.out.println("Created a table");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not create the table");
			e.printStackTrace();
			return;
		}
		// Insert into table
		try {
			String createString1 = "INSERT INTO " + this.tableName
					+ "(`ID`, `NAME`, `STREET`, `CITY`, `STATE`, `ZIP`) VALUES ('1', 'aa', 'aa', 'aa', 'aa', '58510')";
			String createString2 = "INSERT INTO " + this.tableName
					+ "(`ID`, `NAME`, `STREET`, `CITY`, `STATE`, `ZIP`) VALUES ('2', 'bb', 'bb', 'bb', 'bb', '58510')";
			this.executeUpdate(conn, createString1);
			this.executeUpdate(conn, createString2);
			System.out.println("inserted a record into a table");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not insert the table");
			e.printStackTrace();
			return;
		}
		// to select data from the table
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from " + this.tableName + "where ZIP = 58510");
			while (rs.next()) {
				String ID = rs.getString("ID");
				String NAME = rs.getString("NAME");
				String STREET = rs.getString("STREET");
				String CITY = rs.getString("CITY");
				String STATE = rs.getString("STATE");
				String ZIP = rs.getString("ZIP");
				System.out.println(ID + "\t" + NAME + "\t" + STREET + "\t" + CITY + "\t" + STATE + "\t" + ZIP + "\t");
			}
		} catch (SQLException e) {
			System.out.println("ERROR: Could not SELECT from the table");
			e.printStackTrace();
			return;
		}
	}

	public static void main(String[] args) {
		week13_DBdemo app = new week13_DBdemo();
		app.run();

	}
}
