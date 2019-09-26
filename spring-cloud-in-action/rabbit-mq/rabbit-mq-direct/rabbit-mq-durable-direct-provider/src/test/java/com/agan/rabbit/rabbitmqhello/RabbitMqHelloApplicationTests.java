package com.agan.rabbit.rabbitmqhello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.agan.rabbit.RabbitMqHelloApplication;
import com.agan.rabbit.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqHelloApplication.class)
public class RabbitMqHelloApplicationTests {

	@Autowired
	private Sender sender;
	
	@Test
	public void send() throws InterruptedException {
		for (int i = 0; i < 200; i++) {
			Thread.sleep(2000);
			this.sender.send(i);
		}
			
			
	}

}
