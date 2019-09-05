package com.yc.shoesMall.biz.backManage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.yc.shoesMall.bean.Order;
import com.yc.shoesMall.dao.OrderMapper;
import com.yc.shoesMall.result.Result;

@Service
public class OrderBiz_back {

	@Resource
	private OrderMapper om;
	
	/**
	 * 分页查询查询 订单
	 * @return
	 */
	public Result queryProduct(int page, int limit, Order order){
		PageHelper.startPage(page, limit);
		List<Order> list = om.selectByExample(null);
		return new Result(0, "OK",list.size(), list);
	}
}
