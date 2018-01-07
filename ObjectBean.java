package crud_app;

import java.sql.*;

public class ObjectBean {
	
	private String dbURL = "jdbc:mysql://localhost:3306/sampledb";
	private String username = "root";
	private String password = "private";
	
	
	public void insertStatement( String user, String pwd, String fullname, String email){ 
	try {
	 
	    Connection conn = DriverManager.getConnection(dbURL, username, password);
	 
	    if (conn != null) {
	        System.out.println("Connection established successfully");
	        String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
	   	 
	    	PreparedStatement statement = conn.prepareStatement(sql);
	    	statement.setString(1, user);
	    	statement.setString(2, pwd);
	    	statement.setString(3, fullname);
	    	statement.setString(4, email);
	    	 
	    	int rowsInserted = statement.executeUpdate();
	    	if (rowsInserted > 0) {
	    	    System.out.println("A new user was inserted successfully!");
	    	}
	    	conn.close();
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
	}
	
	public void removeStatement(String user){
		try {
			 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected");
		        String sql = "DELETE FROM Users WHERE username=?";
		   	 
		    	PreparedStatement statement = conn.prepareStatement(sql);
		    	statement.setString(1, user);
		    	int rowsDeleted = statement.executeUpdate();
		    	if (rowsDeleted > 0) {
		    	    System.out.println("A user was deleted successfully!");
		    	}
		    	conn.close();
		}}
		    catch (SQLException ex) {
			    ex.printStackTrace();
			}}
	
	public void selectStatement(String name){
		try {
			 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected");
		        String sql = "SELECT fullname FROM Users WHERE username=?";
		   	 
		    	PreparedStatement statement = conn.prepareStatement(sql);
		    	statement.setString(1, name);
		    	ResultSet result = statement.executeQuery(sql);
		    	
		    	Integer counter=0;
		    	
		    	while(result.next()){
		    		String username = result.getString(2);
		    	    String pass = result.getString(3);
		    	    String fullname = result.getString("fullname");
		    	    String email = result.getString("email");
		    	 
		    	    String output = "User #%d: %s - %s - %s - %s";
		    	    System.out.println(String.format(output, ++counter, name, pass, fullname, email));
		    	}
		    	conn.close();
		    	
		    
		}}
		    catch (SQLException ex) {
			    ex.printStackTrace();
			}
		}
	
	public void updateStatement( String user, String pwd, String fullname, String email){ 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connection established successfully");
		        String sql = "UPDATE Users SET username=?, password=?, fullname=?, email=?";
		   	 
		    	PreparedStatement statement = conn.prepareStatement(sql);
		    	statement.setString(1, user);
		    	statement.setString(2, pwd);
		    	statement.setString(3, fullname);
		    	statement.setString(4, email);
		    	 
		    	int rowsInserted = statement.executeUpdate();
		    	if (rowsInserted > 0) {
		    	    System.out.println("A user was updated successfully!");
		    	}
		    	conn.close();
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		}
}