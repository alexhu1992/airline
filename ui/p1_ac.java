package com.airline.ui;

import com.airline.db.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.Statement;

public class p1_ac extends sys_ui{
	 
	 
		 Statement stmt;  

	 //initialize variables in table flight
        
	    
		 public static String GetFlight() {	
			  
			 //initialize two space for output result
			 ArrayList<String> list=new ArrayList<String>();
			 String ss="";
			 String str=null;
			 flight f=new flight();
			 DBDriver db = new DBDriver();
			 
			try { 	 
				   String sql="SELECT * FROM flight where departure_airport_code ='" +jp1_jtf1.getText()+"'and arrival_airport_code='" +jp1_jtf2.getText()+"';";
				  /*  String tab= "flight";		
				    String cond="departure_airport_code='"+jp1_jtf1.getText()+"'and arrival_airport_code='" +jp1_jtf2.getText(); 
				    String sql="SELECT * FROM"+tab+"where"+cond+"';";*/
				    	
				   ResultSet rs = db.executeQue(sql); 
	            	
	            	while (rs.next()) {
	            	f.setFn(rs.getString("flight_number"));	
	            	f.setAl(rs.getString("airline"));
	            	f.setWk(rs.getString("weekdays"));
	            	f.setDac(rs.getString("departure_airport_code"));
	            	f.setSdt(rs.getString("scheduled_departure_time"));
	            	f.setAac(rs.getString("arrival_airport_code"));
	            	f.setSat( rs.getString("scheduled_arrival_time"));
	            	f.setFd(rs.getString("flight_duration"));
	            	
	   				String fn=f.getFn();	   						
	   				String al=f.getAl();
	   				String wk=f.getWk();
	   				String dac=f.getDac();
	   			    String sdt=f.getSdt();
	   			    String aac=f.getAac();
	   			    String sat=f.getSat();
	   			    String fd=f.getFd();
	   			    
	   				str=fn+"   " + al +"   " + wk + "  "+ dac +"  " +sdt+"  "+aac+" "+sat+"  "+fd;
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
		
		//sql compatible leg
		
		 
		
}
	 


