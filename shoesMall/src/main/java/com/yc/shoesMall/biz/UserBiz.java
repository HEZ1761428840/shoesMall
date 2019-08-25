package com.yc.shoesMall.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.shoesMall.bean.User;
import com.yc.shoesMall.bean.UserExample;
import com.yc.shoesMall.dao.UserMapper;


@Service
public class UserBiz {
		
		@Resource
		private UserMapper um;
		
		@GetMapping("login")
		public User login(String name, String password) throws BizException {
			UserExample ue =new UserExample();
			ue.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
			List<User> list = um.selectByExample(ue);
			if(list.size()==0) {
				throw new BizException("用户名或者密码错误！！！");
			}
			return list.get(0);
		}
}
