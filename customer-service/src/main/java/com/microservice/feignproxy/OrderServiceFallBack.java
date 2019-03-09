package com.microservice.feignproxy;

import java.util.ArrayList;
import java.util.List;

import com.microservice.model.Order;

import feign.FeignException;

public class OrderServiceFallBack implements OrderServiceProxy {
	private final Throwable cause;
	
	@Override
	public List<Order> getAllOrders() {
		if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
        }
		return new ArrayList<>();
	}
	public OrderServiceFallBack(Throwable cause) {
		this.cause = cause;
	}

}
