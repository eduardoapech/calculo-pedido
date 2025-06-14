package com.edu.calculo_pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.edu.entities.Order;
import com.edu.services.OrderService;

@SpringBootApplication
@ComponentScan(basePackages = "com.edu")
public class CalculoPedidoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CalculoPedidoApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		double total1 = orderService.total(order1);
		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n%n", order1.getCode(), total1);
		
		Order order2 = new Order(2282, 800.00, 10.0);
		double total2 = orderService.total(order2);
		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n%n", order2.getCode(), total2);
		
		Order order3 = new Order(1309, 95.90, 0.0);
		double total3 = orderService.total(order3);
		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n%n", order3.getCode(), total3);
	}

}
