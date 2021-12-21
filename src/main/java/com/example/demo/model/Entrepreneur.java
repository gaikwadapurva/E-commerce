/**
 * 
 */
package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * @author apurva.gaikwad
 *
 */

@Entity
public class Entrepreneur {
	
	@Id
	@Column
	private String emailID;
	
	@Column
	private String password;

	@OneToMany
	private List<Deal> deals;
	
	public Entrepreneur(String emailID, String password) {
		this.emailID = emailID;
		this.password = password;
		this.deals = new ArrayList<>();
	}

	public List<Deal> getDeals() {
		return deals;
	}

	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}
	
}
