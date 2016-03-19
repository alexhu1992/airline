/*
 * select all fare information by given a flight number
 */
package com.airline.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.airline.db.DBDriver;
import com.mysql.jdbc.Statement;


public class p4_ac extends sys_ui {

	Statement stmt;  

//initialize variables in table fare

	
   
	//get fare information
	public static String GetFare() {		 
	
		 
		DBDriver db = new DBDriver();  
	 //initialize two space for output result
		ArrayList<String> list=new ArrayList<String>();
		String ss="";
		String str=null; 
		fare fa=new fare();
		try { 	 
			   String sql="SELECT * FROM fare where flight_number ='" +jp4_jtf1.getText()+"';";

			    	
			   ResultSet rs = db.executeQue(sql); 
           	
           	while (rs.next()) {
           		
           		fa.setFn(rs.getString("flight_number"));
           		fa.setFc(rs.getString("fare_code"));
           		fa.setAm(rs.getString("amount"));
           		fa.setRes(rs.getString("restrictions"));
           		
  				String fn = fa.getFn() ;
  				String fc = fa.getFc() ;
  				String am = fa.getAm();
  				String res = fa.getRes();  				
  			   	str=fn+"   " + fc +"   " + am + "  "+ res;
  			   	
  				list.add(str);  			    
               }  
           	
           	    for(int i=0;i<list.size();i++){
			     String str1=list.get(i);
			     ss=ss+str1+"\n";
			    
          }
 	    } 
           	catch (SQLException e1) {  
               // TODO Auto-generated catch block  
               e1.printStackTrace();  
           }  	           
          return ss;
	}
	
}
