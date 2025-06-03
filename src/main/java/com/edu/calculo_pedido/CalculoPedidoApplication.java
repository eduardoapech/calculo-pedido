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
	}

}
