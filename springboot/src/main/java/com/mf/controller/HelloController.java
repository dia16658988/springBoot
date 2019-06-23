package com.mf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author msi
 * @Date 2019/6/22 23:29
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
