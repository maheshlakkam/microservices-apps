package com.microservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.config.CustomerConfiguration;
import com.microservice.feignproxy.OrderServiceProxy;
import com.microservice.model.Customer;
import com.microservice.model.Order;

@RestController
public class CustomerController {
	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerConfiguration configuration;
	
	@Autowired
	OrderServiceProxy orderServiceProxy;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {
		logger.info(" Customer Service is invoked:");
		List<Customer> customerList = new ArrayList<Customer>();
		List<Order> orderList = orderServiceProxy.getAllOrders();
		long count = orderList.stream().filter(o->o.getCustId()==123).collect(Collectors.toList()).size();
		customerList.add(new Customer("ABC",123, configuration.getType(),count));
		count = orderList.stream().filter(o->o.getCustId()==124).collect(Collectors.toList()).size();
		customerList.add(new Customer("XYZ",124, configuration.getType(),count));
		return customerList;
	}
	
}
