package com.microservice.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Order;


@RestController
public class OrderController {
	Logger logger = LoggerFactory.getLogger(OrderController.class);
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		logger.info("Order service is invoked");
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order(100, "First Order", new Date(), 123));
		orderList.add(new Order(101, "Second Order",new Date(), 124));
		return orderList;
	}
	
	
	@GetMapping("/order/{orderId}")
	public Order getOrderDetails(@PathVariable final int orderId) {
		return new Order(100, "First Order", new Date(),123);
	}
}
