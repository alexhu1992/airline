package com.airline.db;
import java.sql.*;

public class DBDriver {
	
	 
      ResultSet rs = null; 
      Connection myConn=null;
      Statement myStmt=null;
	public ResultSet executeQue(String sql_s) { 
		
        try { 
        	myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline" , "root","");// get connection to database
        	
        	myStmt = myConn.createStatement(); //create a SQL statement
            
            rs = myStmt.executeQuery(sql_s);  
        } catch (SQLException e) {  
            System.out.println(e);  
        }  
        return rs;  
    }
	public void execute2(String sql_s) { 
		
        try { 
        	myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline" , "root","");// get connection to database
        	
        	myStmt = myConn.createStatement(); //create a SQL statement
            
            myStmt.execute(sql_s);  
        } catch (SQLException e) {  
            System.out.println(e);  
        }  
    }

	
}
	
