package com.airline.ui;

import java.sql.Date;

public class flight_instance {

    String fn = null;
	Date date = null;
	String noas = null;
	String id = null;
	String dt = null;
	String at = null;
	
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public Date getDate() {
		return date;
	}

	public String getNoas() {
		return noas;
	}
	public void setNoas(String noas) {
		this.noas = noas;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public void setDate(Date date) {
		this.date = date;		
	}

}
