package com.airline.ui;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.airline.db.*;



public class p2_ac2 extends sys_ui {
	
	public static String getcount(){
		
		 ArrayList<String> list=new ArrayList<String>();
		 String ss="";
		 String str=null;
		 seat s=new seat();
		 DBDriver db = new DBDriver();
			try { 	 
				   String sql="SELECT count(flight_number) FROM seat_reservation where flight_number='"+jp2_jtf1.getText()+"';";
				  /*  String tab= "flight";		
				    String cond="departure_airport_code='"+jp1_jtf1.getText()+"'and arrival_airport_code='" +jp1_jtf2.getText(); 
				    String sql="SELECT * FROM"+tab+"where"+cond+"';";*/
				    	
                    ResultSet rs = db.executeQue(sql);
	            	
	            	while (rs.next()) {
	            		
	            	s.setFn(rs.getString("count(flight_number)"));
                    String fn=s.getFn();
	   			    
	   				str=fn;
	   				list.add(str);
	   			    			    
	                }  
	            	 
	            	for(int i=0;i<list.size();i++){
				     String str1=list.get(i);
				     ss=ss+str1+"\n";	
				     System.out.println(ss);
	           }
	  	    } 
	            	catch (SQLException e1) {  
	                // TODO Auto-generated catch block  
	                e1.printStackTrace();  
	            }  	           
	           return ss;
	        } 
		
	}