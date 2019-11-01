package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/*
	 * 根据ID获取一个订单对象
	 */
	Order getOrder(String orderId);
	/*
	 *  保存订单
	 */
	void addOrder(Order order);
}