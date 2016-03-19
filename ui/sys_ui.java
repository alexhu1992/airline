/*
 * netid:mxh144730
 * name: Mengheng Hu
 * project name :airline reservation system
 */

package com.airline.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class sys_ui{
	
	
	// define system window
    
    JFrame jf=new JFrame();
    //north area 
    JTabbedPane jtp = new JTabbedPane();
    //set index for JTabbedPane

    
    JPanel jp1 = new JPanel(new GridLayout(3,1));
    JPanel jp2 = new JPanel(new GridLayout(3,1));
    JPanel jp3 = new JPanel(new GridLayout(2,3));
    JPanel jp4 = new JPanel(new GridLayout(3,1));
    
    //central area
    
    //text field for entering airport code and date
    static JTextField jp1_jtf1;
	static JTextField jp1_jtf2;
	JTextField jp1_jtf3;
	static JTextField jp2_jtf1,jp2_jtf2;
    static JTextField jp3_jtf1;
	static JTextField jp3_jtf2;
    static JTextField jp4_jtf1;
    
    // search button
    JButton jp1_jb1;
    JButton jp2_jb1;
    JButton jp3_jb1;
    JButton jp3_jb2;
    JButton jp4_jb1;
    JButton jp_jb;
    //Labels
    JLabel jp1_jl1;
    JLabel jp1_jl2;
    JLabel jp1_jl3;
    JLabel jp1_jl4;
    JLabel jp2_jl1;
    JLabel jp2_jl2;
    JLabel jp2_jl3;
    JLabel jp3_jl1;
    JLabel jp3_jl2;
    JLabel jp4_jl1;
    
    // a combox
    JComboBox jcb;
    //south area 
    //text area for showing query results
    JTextArea jta = new JTextArea();
    JScrollPane jsp = new JScrollPane(jta);
    

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
     //  p1_ac p1_ac=new p1_ac();       
      // p2_ac p2_ac=new p2_ac();
		sys_ui ui=new sys_ui();

	}
	

	 
	public sys_ui(){
		
		//north area
		jtp.add("Flights", jp1);   //flights search panel
		jtp.add("Seats search", jp2);  //seats search panel
		jtp.add("Passenger information", jp3); //passenger information search panel
		jtp.add("Fare information", jp4); //fare information search panel
		
		//central area
		//initialize button on panel 1
		jp1_jb1= new JButton("Search Fligths");
		
		//initialize button on panel 2
		jp2_jb1= new JButton("Search seats");
		
		//initialize button on panel 3
		jp3_jb1= new JButton("List passenger");
		jp3_jb2= new JButton("Search flights");
		
		//initialize button on panel 4
		jp4_jb1= new JButton("Search");
		
		//
		jp_jb = new JButton("clear all");
		// jcombox initialization
		String []jg={"0","1","2"};
		jcb=new JComboBox(jg);
		
		//initialize text field panel1
		jp1_jtf1 = new JTextField();
		jp1_jtf2 = new JTextField();
		jp1_jtf3 = new JTextField();
		
		//initialize text field on panel2
		jp2_jtf1 = new JTextField();
		jp2_jtf2 = new JTextField();
		
		//initialize text field on panel3
		jp3_jtf1 = new JTextField();
		jp3_jtf2 = new JTextField();
		
		//initialize text field on panel 4
		jp4_jtf1 = new JTextField();
		
		//initialize label  on panel1 
		jp1_jl2 = new JLabel("From");		
		jp1_jl3 = new JLabel("To");		
		jp1_jl4 = new JLabel("Passenger's name");
		
		
		//initialize label on panel2
		jp2_jl1 = new JLabel("Flight number");
		jp2_jl2 = new JLabel("date");
	    jp2_jl3 = new JLabel();
	    
	    
		//initialize label on panel3
		jp3_jl1 = new JLabel("Flight number");
		jp3_jl2 = new JLabel("Passenger's name");
		
		//initialize label on panel4
		jp4_jl1 = new JLabel("Flight number");
		//add components to each panel
		jp1.add(jp1_jl2);
		jp1.add(jp1_jl3);		
		jp1.add(jp1_jtf1);
		jp1.add(jp1_jtf2);
		jp1.add(jp1_jb1);
		jp1.add(jcb);
         
		jp2.add(jp2_jl1);
		jp2.add(jp2_jtf1);
		jp2.add(jp2_jl2);
		jp2.add(jp2_jtf2);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jl3);
		//add components to panel3
		jp3.add(jp3_jl1);
		jp3.add(jp3_jtf1);
		jp3.add(jp3_jb1);
		jp3.add(jp3_jl2);
		jp3.add(jp3_jtf2);		
		jp3.add(jp3_jb2);
		
		//add components to panel4
		jp4.add(jp4_jl1);
		jp4.add(jp4_jtf1);
		jp4.add(jp4_jb1);
		//add panel to main window		
		jf.add(jtp,"North");
		jf.add(jsp,"Center");
		jf.add(jp_jb, "South");
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setTitle("Airline Reservation System");
		
		//add event handler on jp_jb
	    //add action on clear all button
		jp_jb.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if(jta.getText()!=null)
	    		 {	    			 
	    			 jta.setText(null);       //set text area to null
	    		
	    		 }
			 }
		});
		
		//add action command
		
		 jp1_jb1.addActionListener(new ActionListener() {
			 
			 public void actionPerformed(ActionEvent e) {
				 
				 if(jp1_jtf1.getText().length()==0 &&jp1_jtf2.getText().length()==0) {
	    			 jta.setText("please enter airport code");
	    		 }
	    		 
	    		//no input on from field
	    		 else if (jp1_jtf1.getText().length()==0 &&jp1_jtf2.getText().length()!=0) {
	    			 jta.setText("please enter departure airport code");
	    		 }
	    		 //no input on to field
	    		 else if (jp1_jtf1.getText().length()!=0 &&jp1_jtf2.getText().length()==0) {
	    			 jta.setText("please enter arrival airport code");
	    		 }
				 
	    		 else {	    			 
	    			 String ss=p1_ac.GetFlight();
	    			 jta.setText(ss);
	    			 if(jcb.getSelectedIndex()==1)   //choose 1 leg for searching
	    			 {
	    				 String ss1=p1_acleg.GetLeg();    //method of leg1  
	    				 String ss2=p1_acleg2.GetLeg2();   //method of leg2
	    				 if(ss2.length()==0)  //no flights found on leg2, then print out no flights found
	    				 {
	    					 jta.setText("No Compatible Flights found!");
	    				 }
	    				 else{
	    					 jta.setText(ss1+"\n"+"connection"+"\n"+ss2);
	    				 }
	    			 }
	    			 
	    			 else if (jcb.getSelectedIndex()==2) //choose two leg
	    			 {
	    				 String ss1=p1_acleg3.GetLeg3();  //method of leg1  
	    				 String ss2=p1_acleg32.GetLeg3(); //method of leg2
	    				 String ss3=p1_acleg33.GetLeg3();  //method of leg3
	    				 jta.setText(ss1+"\n"+"connection"+"\n"+ss2+"\n"+"connection"+"\n"+ss3);
	    				 if(ss3.length()==0)              //if no compatible legs found
	    				 {
	    					 jta.setText("No Compatible Flights found!"); 
	    				 }
	    			 }
	    		 }
			 }
		 });
						
		//add action on panel2, search seats
		jp2_jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (jp2_jtf1.getText().length()==0 &&jp2_jtf2.getText().length()!=0) {
	    			 jp2_jl3.setText("please enter flight number");
	    		 }
	    		 //no input on date field
	    		 else if (jp2_jtf1.getText().length()!=0 &&jp2_jtf2.getText().length()==0) {
	    			 jp2_jl3.setText("please enter date");
	    		 }
	    		 else {
	    			// String ss=p2_ac1.getMax();
	    			// String ss=p2_ac2.getcount();
	    			 p2_ac3.update(); //update noas first 
	    			 String ss=p2_ac4.getnoas();  //and then search seats
	    			 jta.setText(ss); 
	    		 }
			}
		});
		
		
		//add action on panel3  search customer information based on flight number
		jp3_jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				 if (jp3_jtf1.getText().length()==0) {
	    			 jta.setText("please enter flight number");
	    		 }
				 
				 else {
					 String ss=p3_ac.GetPass();
					 jta.setText(ss);
				 }

			}
			
		});
		
		jp3_jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
	
					 String ss=p3_ac2.GetFlightins();
					 jta.setText(ss);
					 
				 }			 
			
		});
		
		jp4_jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				 if (jp4_jtf1.getText().length()==0 ) {
					 jta.setText("please enter flight number");
				 }
				 
				 else{
					 String ss=p4_ac.GetFare();
					 jta.setText(ss);
				 }
				 }
		});
	    
	}



	

}



	    
	    	
	    

