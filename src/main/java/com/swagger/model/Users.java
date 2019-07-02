package com.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 * Devil
 * 2019年7月2日
 */
@ApiModel(value = "用户信息")
public class Users {

	@ApiModelProperty(value = "用户登录账号", required = true)
	private String userName;

	@ApiModelProperty(value = "用户年龄")
	private int userAge;

	@ApiModelProperty(value = "用户性别")
	private String userSex;
	
	@ApiModelProperty(value = "用户编码")
	private String userCode;

	@ApiModelProperty(value = "用户昵称")
	private String nickName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
