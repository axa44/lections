package ru.progwards.java2.lessons.recursion;

import java.sql.Date;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Goods {

//	1.1 Реализовать класс Goods - товар, содержащий
//	String name - наименование
//	String number - артикул
//	int available - количество на складе
//	double price - цена
//	Instant expired - срок годности
	
	private String number = "";
	private int available;
	private double price;
	private Instant expired;
	private String name = "";
	
	public Goods(String name, String number, int available, double price, String date) {
	
		this.name = name;
		this.number = number;
		this.available = available;
		this.price = price;
		
//		this.expired = this.parseDate(date);
		this.expired = Instant.parse(date);
	}
	
	public Instant parseDate(String date) {
		return Instant.ofEpochMilli(new SimpleDateFormat("dd.mm.yyyy").parse(date, 	new ParsePosition(0)).getTime());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Instant getExpired() {
		return expired;
	}
	public void setExpired(Instant expired) {
		this.expired = expired;
	}
	
	public String toString() {
		return this.name + "-" + this.number + "-" + this.available + "-" +this.price  + "-" +this.expired;
	}
	
}
