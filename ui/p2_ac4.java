package com.airline.ui;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.airline.db.*;



public class p2_ac4 extends sys_ui {
	
	public static String getnoas(){
		
		 ArrayList<String> list=new ArrayList<String>();
		 String ss="";
		 String str=null;
		 flight_instance fi=new flight_instance();
		 DBDriver db = new DBDriver();
			try { 	 
				   String sql="SELECT * FROM flight_instance where flight_number='"+jp2_jtf1.getText()+"'and date='"+jp2_jtf2.getText()+"';";
				  /*  String tab= "flight";		
				    String cond="departure_airport_code='"+jp1_jtf1.getText()+"'and arrival_airport_code='" +jp1_jtf2.getText(); 
				    String sql="SELECT * FROM"+tab+"where"+cond+"';";*/
				    	
                    ResultSet rs = db.executeQue(sql);
	            	
	            	while (rs.next()) {
	            		
	            	fi.setFn(rs.getString("flight_number"));
	            	fi.setDate(rs.getDate("date"));
	            	fi.setNoas(rs.getString("noas"));
	            	fi.setId(rs.getString("airplane_id"));
	            	fi.setDt(rs.getString("departure_time"));
	            	fi.setAt(rs.getString("arrival_time"));
	            	
                    String fn=fi.getFn();
                    Date date=fi.getDate();
                    String noas=fi.getNoas();
                    String id=fi.getId();
                    String dt=fi.getDt();
                    String at=fi.getAt();
	   			    
	   				str=fn+"   "+date.toString()+"   "+noas+"   "+id +"   "+dt+" "+at+"   ";
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