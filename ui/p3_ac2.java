/*
 * select flight instance by a customer name
 */
package com.airline.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.airline.db.DBDriver;
import com.mysql.jdbc.Statement;

public class p3_ac2 extends sys_ui{


		 Statement stmt;  
		 	    
		public static String GetFlightins() {	
			 
			 ResultSet rs;  
			 DBDriver db = new DBDriver();  
			 ArrayList<String> list=new ArrayList<String>();
			 String ss="";
			 String str=null;
			 flight_instance ft=new flight_instance();
			 
			try { 	 
				   String sql="SELECT * FROM flight_instance as f join seat_reservation as s on f.flight_number=s.flight_number where customer_name ='" +jp3_jtf2.getText()+"';";
				  /*  String tab= "flight";		
				    String cond="departure_airport_code='"+jp1_jtf1.getText()+"'and arrival_airport_code='" +jp1_jtf2.getText(); 
				    String sql="SELECT * FROM"+tab+"where"+cond+"';";*/
				    	
				rs = db.executeQue(sql); 
	            	
	            	while (rs.next()) {
	            	
	            	ft.setFn(rs.getString("flight_number"));
	            	ft.setDate(rs.getDate("date"));
	            	ft.setNoas(rs.getString("noas"));
	            	ft.setId(rs.getString("airplane_id"));
	            	ft.setDt(rs.getString("departure_time"));
	            	ft.setAt(rs.getString("arrival_time"));
	            	
	   				String fn = ft.getFn();
	   				Date date = ft.getDate();
	   				String noas = ft.getNoas();
	   				String id = ft.getId();
	   			    String dt = ft.getDt();
	   			    String at = ft.getAt();
	  
	   				str=fn+"   " + date +"   " + noas + "  "+ id +"  " +dt+"  "+at;
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
