/**
 * 
 */
package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.*;

/**
 * @author apurva.gaikwad
 *
 */
public class Deal extends BaseEntity {

	@Column
	private String item_name;
	
	@Column
	private int number_of_items;
	
	@Column
	private double price;
	
	@Column
	private LocalDateTime creation_datetime;
	
	@Column
	private LocalDateTime end_datetime;

	public Deal(String item_name, int number_of_items, double price, int time_period_in_hours) {
		super();
		this.item_name = item_name;
		this.number_of_items = number_of_items;
		this.price = price;
		this.creation_datetime = LocalDateTime.now();
		this.end_datetime = this.creation_datetime.plusHours(time_period_in_hours);
	}

	public String getItem_name() {
		return item_name;
	}

	public int getNumber_of_items() {
		return number_of_items;
	}

	public void setNumber_of_items(int number_of_items) {
		this.number_of_items = number_of_items;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getCreation_datetime() {
		return creation_datetime;
	}

	public LocalDateTime getEnd_datetime() {
		return end_datetime;
	}

	public void setEnd_datetime(int time_period_in_hours) {
		this.end_datetime = this.end_datetime.plusHours(time_period_in_hours);
	}
	
}
