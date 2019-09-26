package com.agan.rabbit;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * @author 阿甘
 * @see http://study.163.com/provider/1016671292/index.htm
 * @version 1.0
 */
@Component
public class Sender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${mq.config.exchange}")
	private String exchange;
	
	public void send(int n) throws InterruptedException{
		String msg="hello:"+n;
		this.rabbitTemplate.convertAndSend(this.exchange,"log.error.routing.key", msg);
		System.out.println(msg);
	}
}
