package com.edu.services;

import org.springframework.stereotype.Service;

import com.edu.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public double total(Order order) {
		return order.getCode() ;
	}

}
