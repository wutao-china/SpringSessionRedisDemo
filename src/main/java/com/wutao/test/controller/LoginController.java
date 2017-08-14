package com.wutao.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	@RequestMapping("/login.do")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/main.do")
	public String main(){
		return "main";
	}
	
	
	@RequestMapping("/doLogin.do")
	public String doLogin(HttpServletRequest req,HttpSession session,String userName,String passWord){
		String sessionUserName = (String) session.getAttribute("userName");
		if(!StringUtils.isEmpty(sessionUserName)){
			return "main";
		}
		
		if(StringUtils.isEmpty(userName)){
			return "login";
		}
		
		session.setAttribute("userName", userName);
		session.setAttribute("sessionPort", req.getLocalPort());
		
		return "redirect:main.do";
	}
	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		return "login";
	}
	
		
	
}
