package com.example.demo.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.*;

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void register(String name, String emailID, String password, String billing_address) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(name, emailID, password, billing_address);
		entityManager.persist(customer);
		System.out.println("Customer created successfully!");
	}

	@Override
	public void deleteAccount(String emailID) {
		// TODO Auto-generated method stub
		Customer customer = entityManager.find(Customer.class, emailID);
		entityManager.remove(customer);
		System.out.println("Customer account deleted successfully!");
	}

	@Override
	public void buyDeal(String emailID, Deal deal) {
		// TODO Auto-generated method stub
		Customer customer = entityManager.find(Customer.class, emailID);
		if (customer.getDeal() != null) {
			System.out.println("Cannot buy any more deals since you've already bought one");
		}
		else {
			if (deal.getNumber_of_items() > 0) {
				deal.setNumber_of_items(deal.getNumber_of_items() - 1);
				entityManager.merge(deal);
				entityManager.merge(customer);
				System.out.println("Deal bought successfully!");
			}
			else {
				System.out.println("Deal sold already, sorry!");
			}
		}
	}

	@Override
	public void getAccountDetails(String emailID) {
		// TODO Auto-generated method stub
		Customer customer = entityManager.find(Customer.class, emailID);
		System.out.println(customer.toString());
	}

}
