/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.EntrepreneurService;

/**
 * @author apurva.gaikwad
 *
 */

@Controller ("/entrepreneur")

public class EntrepreneurController {

	@Autowired
	private EntrepreneurService entrepreneurService;
	
	/* @GetMapping("/add-deal")
	public String createDeal(@RequestParam String name, @RequestParam int number_of_items, @RequestParam double price, @RequestParam int time_period_in_hours) {
		entrepreneurService.createDeal(name, number_of_items, price, time_period_in_hours);
	} */
}
