package com.yc.shoesMall.web;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.shoesMall.bean.User;
import com.yc.shoesMall.biz.BizException;
import com.yc.shoesMall.biz.UserBiz;
import com.yc.shoesMall.result.Result;


@RestController
public class loginAction {
	
	/**
	 * @param name
	 * @param password
	 * @param model
	 * @return
	 */
	@Resource
	private UserBiz ub;
	
	@PostMapping("login")
	public Result login(String name,String password,Model model) {
	try{
		User user = ub.login(name, password);
		return new Result(1, "OK",user);
	}catch(BizException e){
		return new Result(0,e.getMessage());
	}catch( RuntimeException e) {
		e.printStackTrace();
		return new Result(0,"业务繁忙，请稍后再试");
		}
	}
}
