package com.atguigu.springcloudeclispse.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloudeclispse.bean.User;
import com.atguigu.springcloudeclispse.service.UserService;
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user")
	public User getUser(@RequestParam("id") Integer id) {
		User user = userService.getUserById(id);
		return user;
	}

	@GetMapping("/buyMovie")
	public Map<String, Object> buyMovie(@RequestParam("id") Integer userid) {
		Map<String, Object> map = userService.buyMovie(userid);
		return map;
	}

}
