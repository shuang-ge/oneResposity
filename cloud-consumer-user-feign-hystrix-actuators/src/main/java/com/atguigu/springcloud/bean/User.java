package com.atguigu.springcloud.bean;

public class User {
	private Integer id;
	private String userName;

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

}
