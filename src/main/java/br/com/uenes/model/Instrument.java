package br.com.uenes.model;

import java.time.LocalDate;

public class Instrument {
	private String name;
	private LocalDate date;
	private Float value;
	
	public Instrument (String name, LocalDate date, Float value) {
		this.name = name;
		this.date = date;
		this.value = value;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
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
