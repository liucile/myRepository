package com.hph.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

public class MySelfRule {
    @Bean
    public IRule myRule() {
        //return new RandomRule();//Ribbon默认是轮询，我自定义为随机

        return  new RandomRule_ZDY();//每个机器被访问5次


    }
}
