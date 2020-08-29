import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class mysqltime {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection
		("jdbc:mysql://root@localhost/senprep");

		Statement s = connection.createStatement();

		ResultSet dbresult = s.executeQuery("SELECT * FROM `senthil`");

		while(dbresult.next()){
		System.out.println(dbresult.getInt(1));
		System.out.println(dbresult.getString(2)); 
		}
	}

}
