package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//注册
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker // 开启短路保护
@EnableFeignClients // 开启feign功能
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerUserApplication.class, args);
	}

}
