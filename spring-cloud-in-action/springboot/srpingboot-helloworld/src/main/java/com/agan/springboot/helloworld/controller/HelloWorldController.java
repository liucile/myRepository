package com.agan.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agan.springboot.helloworld.exception.BusinessException;
/**
 * @author 阿甘
 * @see http://study.163.com/provider/1016671292/index.htm
 * @version 1.0
 */
@RestController
public class HelloWorldController {
	
	@Value("${agan.msg}")
	private String msg;
	
	@RequestMapping("/hello")
	public String index(){
//		int no=1/0;
//		throw new BusinessException("100","用户名密码错误！");
		return this.msg;
	}
}
