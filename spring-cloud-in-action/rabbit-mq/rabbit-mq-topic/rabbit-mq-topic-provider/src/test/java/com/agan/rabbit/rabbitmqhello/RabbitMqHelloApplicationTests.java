package com.agan.rabbit.rabbitmqhello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.agan.rabbit.OrderSender;
import com.agan.rabbit.ProductSender;
import com.agan.rabbit.RabbitMqHelloApplication;
import com.agan.rabbit.UserSender;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqHelloApplication.class)
public class RabbitMqHelloApplicationTests {

	@Autowired
	private UserSender userSender;
	
	@Autowired
	private ProductSender productSender;
	
	@Autowired
	private OrderSender orderSender;
	@Test
	public void send() throws InterruptedException {
			this.userSender.send();
			this.productSender.send();
			this.orderSender.send();
			
	}

}
