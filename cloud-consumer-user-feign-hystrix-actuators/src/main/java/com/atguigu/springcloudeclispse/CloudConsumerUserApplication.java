package com.atguigu.springcloudeclispse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrixDashboard
@EnableHystrix
@EnableCircuitBreaker //开启断路保护功能
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CloudConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerUserApplication.class, args);
	}
	
}
