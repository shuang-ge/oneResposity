package com.atguigu.scw.common.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data
public class UserResponseVo implements Serializable{
	private String accessToken;
	// 登陆成功以后存redis的key
	private Integer id;

	private String loginacct;

	private String userpswd;

	private String username;

	private String email;

	private String authstatus;

	private String usertype;

	private String realname;

	private String cardnum;

	private String accttype;

}
