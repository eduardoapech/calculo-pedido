package com.edu.services;

import org.springframework.stereotype.Service;

import com.edu.entities.Order;

@Service
public class ShippingService {
	
	public double shipping(Order order) {
		return order.getBasic() - order.getDiscount();
	}

}
