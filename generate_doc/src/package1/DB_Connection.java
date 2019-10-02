package package1;
import java.sql.*;

public class DB_Connection {

	public Connection getConnection()
	{
		Connection connection = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/k_m", "root" , "");
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return connection;
	}
}
