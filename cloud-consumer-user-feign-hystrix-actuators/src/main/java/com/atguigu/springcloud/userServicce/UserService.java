package com.atguigu.springcloud.userServicce;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.bean.User;
import com.atguigu.springcloud.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public User getUserById(Integer id) {
		User user = userDao.getUser(id);
		return user;
	}
	@Autowired
	MovieServiceFeign movieServiceFeign;

	// 传入用户id，购买最新电影票
	public Map<String, Object> buyMovie(Integer id) {
		Map<String, Object> map = new HashMap<>();
		User user = getUserById(id);
		Movie movie = movieServiceFeign.getNewMovie();
		map.put("user", user);
		map.put("movie", movie);
		return map;
	}

}