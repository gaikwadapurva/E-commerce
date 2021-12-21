/**
 * 
 */
package com.example.demo.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Deal;

/**
 * @author apurva.gaikwad
 *
 */
public class EntrepreneurDaoImpl implements EntrepreneurDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void createDeal(String name, int number_of_items, double price, int time_period_in_hours) {
		// TODO Auto-generated method stub
		Deal deal = new Deal(name, number_of_items, price, time_period_in_hours);
		entityManager.persist(deal);
		System.out.println("Deal created successfully");
	}

	@Override
	public void updateDeal(Deal deal, double price, int time_period_in_hours) {
		// TODO Auto-generated method stub
		deal.setPrice(price);
		deal.setEnd_datetime(time_period_in_hours);
	}

	@Override
	public void endDeal(Deal deal) {
		// TODO Auto-generated method stub
		entityManager.remove(deal);
		System.out.println("Deal removed successfully!");
	}

}
