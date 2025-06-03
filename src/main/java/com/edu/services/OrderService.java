package com.edu.services;

import org.springframework.stereotype.Service;

import com.edu.entities.Order;

@Service
public class OrderService {

	private ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {
		double discount = order.getBasic() * order.getDiscount() / 100.0;
		double valueDiscount = order.getBasic() - discount;
		double freight = shippingService.shipping(order);
		return valueDiscount + freight;
	}

}
