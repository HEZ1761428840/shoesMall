package com.yc.shoesMall.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yc.shoesMall.bean.Orders;
import com.yc.shoesMall.bean.OrdersExample;

import com.yc.shoesMall.dao.OrdersMapper;

@Service
public class MyorderBiz {
	
	@Autowired
	private OrdersMapper om;
	
	public List<Orders> queryMyOrder() {
		OrdersExample example=new OrdersExample();
		//)example.setOrderByClause("create_time desc");
		
		return om.selectByExample(example);
		
		
		
	}

}
