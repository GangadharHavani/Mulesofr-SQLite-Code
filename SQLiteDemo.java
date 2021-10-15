package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl = "jdbc:sqlite:/C:\\sqlite\\Ent.db";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT * FROM Movies";
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				String Moviename = result.getString("Moviename");
				String LeadActor = result.getString("LeadActor");
				String Actress = result.getString("Actress");
				Integer YearOfRelease = result.getInt("YearOfRelease");
				String Director = result.getString("Director");
				
				System.out.println(Moviename + " | " + LeadActor + " | " + Actress + " | " + YearOfRelease + " | " + Director + " | ");
				System.out.println("\n");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error connecting to SQLite Database");
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT  MovieName,LeadActor FROM Movies";
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				String Moviename = result.getString("Moviename");
				String LeadActor = result.getString("LeadActor");
				
				
				System.out.println(Moviename + " | " + LeadActor);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error connecting to SQLite Database");
			e.printStackTrace();
		}
		

	}

}
