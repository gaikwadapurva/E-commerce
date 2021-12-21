/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Deal;
import com.example.demo.service.CustomerService;

/**
 * @author apurva.gaikwad
 *
 */

@Controller ("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/register")
	public String registerCustomer(String name, String emailID, String password, String billing_address) {
		customerService.register(name, emailID, password, billing_address);
		return "/buy-deal";
	}
	
	@GetMapping("/buy-deal")
	public String buyDeal(@RequestParam String emailID, @RequestParam Deal deal) {
		customerService.buyDeal(emailID, deal);
		return "/account-details";
	}
	
	@GetMapping("/account-details")
	public String getAccountDetails(@RequestParam String emailID) {
		customerService.getAccountDetails(emailID);
		return "/account-details";
	}
	
	@GetMapping("/delete-account")
	public String deleteAccount(@RequestParam String emailID) {
		customerService.deleteAccount(emailID);
		return "/register";
	}

}
