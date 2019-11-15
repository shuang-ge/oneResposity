package com.atguigu.springcloud.userServicce;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.userServicce.impl.MovieFeignExceptionServiceImpl;
//fallback 指定一个异常处理类，，返回兜底数据
@FeignClient(value = "CLOUD-PROVIDER-MOVIE",fallback=MovieFeignExceptionServiceImpl.class)
public interface MovieServiceFeign {
	@GetMapping("/movie")
	public Movie getNewMovie();

}
