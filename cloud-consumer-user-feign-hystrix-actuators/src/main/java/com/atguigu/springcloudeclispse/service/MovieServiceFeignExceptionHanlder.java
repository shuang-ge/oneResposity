package com.atguigu.springcloudeclispse.service;

import org.springframework.stereotype.Component;

import com.atguigu.springcloudeclispse.bean.Movie;

@Component
public class MovieServiceFeignExceptionHanlder implements MovieServiceFeign{

	@Override
	public Movie getNewMovie() {
		Movie movie = new Movie(-1,"查询失败请稍后查询");
		return movie;
	}
	
}
