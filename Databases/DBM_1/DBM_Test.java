import java.sql.Connection;
import java.sql.SQLException;

public class DBM_Test {

	public static void main(String[] args) {
		Connection connection = DBM_1.connectDB("uebung_1/database", "SA", null);
		try {
			DBM_1.showQuery(DBM_1.dbQuery(connection, "SELECT * FROM customer"));
		} catch (SQLException except) {
			System.err.println(except.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException except) {
				except.printStackTrace();
			}
		}
	}

}
