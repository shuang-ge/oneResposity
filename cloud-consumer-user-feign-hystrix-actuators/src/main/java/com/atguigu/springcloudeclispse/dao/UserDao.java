package com.atguigu.springcloudeclispse.dao;

import org.springframework.stereotype.Repository;

import com.atguigu.springcloudeclispse.bean.User;
@Repository
public class UserDao {
	public User getUser(Integer id) {
		User user = new User();
		user.setId(id);
		user.setUserName("张三");
		return user;
	}

}
