package com.mlx.web.member.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mlx.entity.CmlUser;
import com.mlx.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="user/test/{userNo}.do", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody CmlUser getUserByPub(@PathVariable String userNo){
		CmlUser user;
		user = userService.getUserByUserNo(userNo);
		return user;
	}
	
	@RequestMapping(value="user/id/{userNo}.do", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody CmlUser getUser(@PathVariable String userNo){
		CmlUser user;
		user = userService.getUserByUserNo(userNo);
		return user;
	}
	
	@RequestMapping(value="user/id/{userNo}", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody CmlUser getUserTw(@PathVariable String userNo){
		CmlUser user;
		user = userService.getUserByUserNo(userNo);
		return user;
	}
	
}
