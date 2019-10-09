package com.hph.springcloud.cfbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //Spring Cloud Ribbon 是基于Netflix Ribbon实现的的一套客户端 负载 均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
    }

}
