/**
 * 
 */
package com.example.demo.model;

import javax.persistence.*;

/**
 * @author apurva.gaikwad
 *
 */

@Entity
public class Customer {

	@Column
	private String name;
	
	@Id
	@Column
	private String emailID;
	
	@Column
	private String password;
	
	@Column
	private String billing_address;
	
	@Column
	private Deal deal;
	
	public Customer(String name, String emailID, String password, String billing_address) {
		this.name = name;
		this.emailID = emailID;
		this.password = password;
		this.billing_address = billing_address;
		this.deal = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	
	public Deal getDeal() {
		return deal;
	}
	
	public void setDeal(Deal deal) {
		this.deal = deal;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailID=" + emailID + ", billing_address=" + billing_address + ", deal="
				+ deal + "]";
	}
	
}
