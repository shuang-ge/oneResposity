package com.atguigu.scw.common.vo;

import java.io.Serializable;

import com.atguigu.scw.common.consts.AppConsts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ResponseVo<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	private String code;// 状态码
	private String message;// 响应提示
	private T data;// 响应数据

	public static <T> ResponseVo<T> ok(T data) {
		return new ResponseVo<>(AppConsts.SUCCESS_CODE, AppConsts.SUCCESS_MESSAGE, data);
	}

	public static ResponseVo fail(String errorMsg) {
		return new ResponseVo<>(AppConsts.FAIL_CODE, errorMsg, null);
	}

}
