/*
 * select customer information by a given flight instance
 */
package com.airline.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.airline.db.DBDriver;
import com.mysql.jdbc.Statement;

public class p3_ac extends sys_ui {

	Statement stmt;  
	   
   public static String GetPass() {	
		
		 ArrayList<String> list=new ArrayList<String>();
		 String ss="";
		 String str="";
		 seat fa=new seat();
		 DBDriver db = new DBDriver();
		 
		try { 	 
			  
			String sql="SELECT seat_number, customer_name, customer_phone FROM seat_reservation where flight_number ='" +jp3_jtf1.getText()+"';";
			ResultSet rs = db.executeQue(sql); 
          	
          	while (rs.next()) {
          		
          		fa.setSn(rs.getString("seat_number"));
          		fa.setCn(rs.getString("customer_name")); 				
 				fa.setCp(rs.getString("customer_phone"));
 				
 				String sn=fa.getSn();
 				String cn=fa.getCn();
 				String cp=fa.getCp();
 			   	str=sn+"   " + cn +"   " + cp;
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
