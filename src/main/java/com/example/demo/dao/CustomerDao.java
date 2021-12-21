/**
 * 
 */
package com.example.demo.dao;

import com.example.demo.model.Deal;

/**
 * @author apurva.gaikwad
 *
 */

public interface CustomerDao {

	public void register(String name, String emailID, String password, String billing_address);
	
	public void getAccountDetails(String emailID);
	
	public void deleteAccount(String emailID);
	
	public void buyDeal(String emailID, Deal deal);
	
}
