/**
 * 
 */
package com.example.demo.dao;

import com.example.demo.model.Deal;

/**
 * @author apurva.gaikwad
 *
 */
public interface EntrepreneurDao {

	public void createDeal(String name, int number_of_items, double price, int time_period_in_hours);
	
	public void updateDeal(Deal deal, double price, int time_period_in_hours);
	
	public void endDeal(Deal deal);
	
}
