package com.atguigu.springcloudeclispse.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springcloudeclispse.bean.Movie;
import com.atguigu.springcloudeclispse.bean.User;
import com.atguigu.springcloudeclispse.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	@Autowired
	MovieServiceFeign moveMovieServiceFeign;

	public User getUserById(Integer id) {
		User user = userDao.getUser(id);
		return user;
	}

	/**
	 * 购买最新的电影票 传入用户id
	 */
	public Map<String, Object> buyMovie(Integer id) {
		Map<String, Object> result = new HashMap<>();
		// 1、查询用户信息
		User user = getUserById(id);
		// 2、查到最新电影票
		Movie movie = moveMovieServiceFeign.getNewMovie();
		result.put("user", user);
		result.put("movie", movie);// 暂时为null
		return result;
	}

}
