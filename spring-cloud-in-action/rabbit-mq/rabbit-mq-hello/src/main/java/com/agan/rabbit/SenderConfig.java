package com.agan.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 阿甘
 * @see http://study.163.com/provider/1016671292/index.htm
 * @version 1.0
 */
@Configuration
public class SenderConfig {
	
	@Bean
	public Queue aganqueue(){
		return new Queue("hello-agan-queue");
	}
}
