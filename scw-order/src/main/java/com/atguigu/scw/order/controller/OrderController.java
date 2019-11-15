package com.atguigu.scw.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "订单模块")
@RequestMapping("/order")
@RestController
public class OrderController {

	@ApiOperation(value = "取消订单")
	@PostMapping("/cancle")
	public String cancleOrder() {
		return "";
	}

	@ApiOperation(value = "创建订单")
	@PostMapping("/create")
	public String createOrder() {
		return "";
	}

	@ApiOperation(value = "立即付款")
	@PostMapping("/pay")
	public String payOrder() {
		return "";
	}
}
