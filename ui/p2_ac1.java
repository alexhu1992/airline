package com.airline.ui;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.airline.db.*;



public class p2_ac1 extends sys_ui {
	
	public static String getMax(){
		
		 ArrayList<String> list=new ArrayList<String>();
		 String ss="";
		 String str=null;
		 airplane a=new airplane();
		 DBDriver db = new DBDriver();
			try { 	 
				   String sql="SELECT max_seats FROM airplane as a join flight_instance as f on a.airplane_id=f.airplane_id where flight_number='"+jp2_jtf1.getText()+"';";
				  /*  String tab= "flight";		
				    String cond="departure_airport_code='"+jp1_jtf1.getText()+"'and arrival_airport_code='" +jp1_jtf2.getText(); 
				    String sql="SELECT * FROM"+tab+"where"+cond+"';";*/
				    	
                    ResultSet rs = db.executeQue(sql);
	            	
	            	while (rs.next()) {
	            		
	            	a.setMs(rs.getString("max_seats"));
                    String ms=a.getMs();
	   			    
	   				str=ms;
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


