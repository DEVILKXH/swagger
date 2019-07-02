package com.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.swagger.model.Users;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/*
 * Devil
 * 2019年7月2日
 */
@Controller
@RequestMapping(value = "/swagger")
@Api(tags = "swagger测试", value = "/swagger")
public class SwaggerTestController {

	@RequestMapping(value = "/getUserLists.do", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "/getUserLists.do", notes = "获取测试数据")
	public List<Users> getUserLists(Users user) {
		List<Users> list = new ArrayList<Users>();
		for(int i = 0; i < 10; i++) {
			Users users = new Users();
			users.setNickName("Devilkxh");
			users.setUserName("Devilkxh");
			users.setUserSex("m");
			users.setUserAge(18);
			users.setUserCode("Devilkxh");
			list.add(users);
		}
		return list;
	}
}
