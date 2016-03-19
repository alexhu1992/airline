	package com.airline.ui;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.airline.db.DBDriver;

	public class p1_acleg32 extends sys_ui {

		public static String GetLeg3() {
			
			 ArrayList<String> list=new ArrayList<String>();
			 String ss="";
			 String str=null; //save first leg
			 flight f=new flight();
			 DBDriver db = new DBDriver();
			 
			try { 	
				
				String sql1="SELECT b.* FROM flight as a left outer join flight as b on a.arrival_airport_code=b.departure_airport_code left outer join flight as c on b.arrival_airport_code=c.departure_airport_code where a.weekdays=b.weekdays and b.weekdays=c.weekdays and a.departure_airport_code ='" +jp1_jtf1.getText()+"'and c.arrival_airport_code='" +jp1_jtf2.getText()+"'"+"and timediff(b.scheduled_departure_time,a.scheduled_arrival_time)>1;";
	 	             	        		   
	 	            ResultSet rs = db.executeQue(sql1); 
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
		            System.out.print(ss);
	         
		    } 

			
	          	catch (SQLException e1) {  
	              // TODO Auto-generated catch block  
	              e1.printStackTrace();  
	          }  	           
	         return ss;
	      }
	}


