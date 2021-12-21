/**
 * 
 */
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Deal;

/**
 * @author apurva.gaikwad
 *
 */

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public void register(String name, String emailID, String password, String billing_address) {
		customerDao.register(name, emailID, password, billing_address);
	}
	
	public void getAccountDetails(String emailID) {
		customerDao.getAccountDetails(emailID);
	}
	
	public void deleteAccount(String emailID) {
		customerDao.deleteAccount(emailID);
	}
	
	public void buyDeal(String emailID, Deal deal) {
		customerDao.buyDeal(emailID, deal);
	}
	
}
