package com.atguigu.springcloud.userServicce.impl;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.userServicce.MovieServiceFeign;

@Service
public class MovieFeignExceptionServiceImpl implements MovieServiceFeign {

	@Override
	public Movie getNewMovie() {
		Movie movie = new Movie(-1, "对不起，无此电影,请刷新重试");
		return movie;
	}

}
