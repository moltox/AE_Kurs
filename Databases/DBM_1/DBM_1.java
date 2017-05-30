import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBM_1 {
	private static boolean loadDriver() {
		boolean loaded = false;
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			loaded = true;
		} catch (ClassNotFoundException except) {
			System.err.println(except.getMessage());
		}
		return loaded;
	}

	public static Connection connectDB(String db_path, String user, String pass) {
		Connection conn = null;
		if (loadDriver()) {
			try {
				String database = "./db/" + db_path;
				conn = DriverManager.getConnection("jdbc:hsqldb:file:" + database, user, pass);
			} catch (SQLException except) {
				System.err.println(except.getMessage());
			}
		}
		return conn;
	}

	public static ResultSet dbQuery(Connection conn, String sql) {
		ResultSet res = null;
		if (conn != null) {
			try {
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				res = stmt.executeQuery(sql);
				stmt.close();
			} catch (SQLException except) {
				System.err.println(except.getMessage());
			}
		}
		return res;
	}

	public static void showQuery(ResultSet res) throws SQLException {
		if (res.first() != false) {
			res.last();
			int maxIDLen = String.valueOf(res.getRow()).length() + 1;
			res.first();
			ResultSetMetaData metaData = res.getMetaData();
			int columnCount = metaData.getColumnCount();
			for (int c = 1; c <= columnCount; c++) {
				if (c == 1) {
					System.out.printf("%-" + maxIDLen + "s ", metaData.getColumnName(c));
				} else {
					System.out.printf("%-" + metaData.getPrecision(c) + "s ", metaData.getColumnLabel(c));
				}
			}
			System.out.println();
			do {
				for (int c = 1; c <= columnCount; c++) {
					if (c == 1) {
						System.out.printf("%-" + maxIDLen + "s ", res.getString(c));
					} else {
						System.out.printf("%-" + metaData.getPrecision(c) + "s ", res.getString(c));
					}
				}
				System.out.println();
			} while (res.next());
		} else {
			System.out.println("Keine Daten vorhanden !");
		}
		res.close();
	}
}
