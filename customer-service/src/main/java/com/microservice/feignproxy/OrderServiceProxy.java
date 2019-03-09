package com.microservice.feignproxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservice.model.Order;
@Component
/*@FeignClient(name="order-service", url="localhost:8083")*/
@FeignClient(name="netflix-zuul-api-gateway-server",fallbackFactory=OrderServiceFallBackFactory.class)
@RibbonClient(name="order-service")
public interface OrderServiceProxy {
	
	@GetMapping("/order-service/orders")
	public List<Order> getAllOrders();
}
