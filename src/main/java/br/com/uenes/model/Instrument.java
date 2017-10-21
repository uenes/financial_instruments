package br.com.uenes.model;

import java.util.Date;

public class Instrument {
	private String name;
	private Date date;
	private Float value;
	
	public Instrument (String name, Date date, Float value) {
		this.name = name;
		this.date = date;
		this.value = value;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
