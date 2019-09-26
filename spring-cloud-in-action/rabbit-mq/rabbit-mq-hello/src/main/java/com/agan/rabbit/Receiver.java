package com.agan.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 * @author 阿甘
 * @see http://study.163.com/provider/1016671292/index.htm
 * @version 1.0
 */
@Component
public class Receiver {
	
	@RabbitListener(queues="hello-agan-queue")
	public void process(String msg){
		System.out.println("receiver:"+msg);
	}
}
