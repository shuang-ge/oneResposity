package com.atguigu.scw.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/order/pay")
@Api(tags = "支付模块")
@RestController
public class PayController {
	@ApiOperation(value = "支付宝支付")
	@PostMapping("/alipay")
	public String alipay() {
		return "";
	}

	@ApiOperation(value = "微信支付")
	@PostMapping("/weixin")
	public String weixin() {
		return "";
	}
}
