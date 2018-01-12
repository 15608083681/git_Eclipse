package com.yyb.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyb.upload.bean.User;

@Controller
public class LoginController {

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("test")
	@ResponseBody
	public User test(@RequestParam("name")String name,@RequestParam("pwd")String pwd) throws Exception{
		User user=new User();
		user.setName(name);
		user.setPwd(pwd);
		user.setSex("女");
		return user;
	}
}
