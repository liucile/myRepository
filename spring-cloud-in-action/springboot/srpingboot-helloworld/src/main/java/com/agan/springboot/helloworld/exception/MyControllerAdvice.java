package com.agan.springboot.helloworld.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author 阿甘
 * @see http://study.163.com/provider/1016671292/index.htm
 * @version 1.0
 */
@ControllerAdvice
public class MyControllerAdvice {

	/**
	 * 全局捕获异常，只要作用在@RequestMapping方法上，所有的异常信息都会被捕获到。
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value=Exception.class)
	public Map<String,Object> errorHandler(Exception ex){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", -1);
		map.put("msg", ex.getMessage());
		return map;
		
	}
	
	@ResponseBody
	@ExceptionHandler(value=BusinessException.class)
	public Map<String,Object> errorHandler(BusinessException ex){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", ex.getCode());
		map.put("msg", ex.getMsg());
		return map;
		
	}
}
