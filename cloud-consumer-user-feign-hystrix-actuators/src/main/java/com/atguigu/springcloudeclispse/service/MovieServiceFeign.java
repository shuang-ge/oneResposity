package com.atguigu.springcloudeclispse.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.atguigu.springcloudeclispse.bean.Movie;

@FeignClient(value = "cloud-provider-movie", fallback = MovieServiceFeignExceptionHanlder.class)
public interface MovieServiceFeign {
	@GetMapping("/movie")
	public Movie getNewMovie();
}
