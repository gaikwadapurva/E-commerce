/**
 * 
 */
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EntrepreneurDao;
import com.example.demo.model.Deal;

/**
 * @author apurva.gaikwad
 *
 */

@Service
public class EntrepreneurService {

	@Autowired
	private EntrepreneurDao entrepreneurDao;
	
	public void createDeal(String name, int number_of_items, double price, int time_period_in_hours) {
		entrepreneurDao.createDeal(name, number_of_items, price, time_period_in_hours);
	}
	
	public void updateDeal(Deal deal, double price, int time_period_in_hours) {
		entrepreneurDao.updateDeal(deal, price, time_period_in_hours);
	}
	
	public void endDeal(Deal deal) {
		entrepreneurDao.endDeal(deal);
	}
}
