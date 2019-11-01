package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/*
	 * 获取用户
	 */
	User getUser(Integer id);
	/*
	 *  增加积分值
	 */
	void addScore(Integer id, Integer score);
}