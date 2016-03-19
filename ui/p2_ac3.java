package com.airline.ui;

import com.airline.db.DBDriver;
import com.mysql.jdbc.Statement;

public class p2_ac3 extends sys_ui{

	Statement stmt;
	public static void update(){
		

		 DBDriver db = new DBDriver();
			String ss1=p2_ac1.getMax();
			  String ss2=p2_ac2.getcount();
			
			   String sql="update flight_instance set noas=("+ss1+"-"+ss2+")"+"where flight_number='"+jp2_jtf1.getText()+"';";
			  /*  String tab= "flight";		
			    String cond="departure_airport_code='"+jp1_jtf1.getText()+"'and arrival_airport_code='" +jp1_jtf2.getText(); 
			    String sql="SELECT * FROM"+tab+"where"+cond+"';";*/
			    	
			   db.execute2(sql);  	           

	        } 
}
