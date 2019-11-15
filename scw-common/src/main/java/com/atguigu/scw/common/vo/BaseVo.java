package com.atguigu.scw.common.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class BaseVo implements Serializable{
	private static final long serialVersionUID = 1L;
	// user项目登陆以后存的token验证是否登陆，同时可以通过token获取用户信息
	private String accessToken;
}
