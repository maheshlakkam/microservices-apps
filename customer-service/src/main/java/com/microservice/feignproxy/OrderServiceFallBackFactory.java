package com.microservice.feignproxy;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
@Component
public class OrderServiceFallBackFactory implements FallbackFactory<OrderServiceProxy>{

	@Override
	public OrderServiceProxy create(Throwable cause) {
		 return new OrderServiceFallBack(cause);
	}
}
