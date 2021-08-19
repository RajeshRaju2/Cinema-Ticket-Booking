package com.mph.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mph.entity.User;
import com.mph.service.UserService;

@Controller
public class UserController {

 User user;
 @Autowired
 UserService userService;
 
	@RequestMapping(value="/registerpage",method= RequestMethod.GET)
	public ModelAndView getPage() {
		return new ModelAndView("register");
	}
	@RequestMapping(value="/signin",method= RequestMethod.GET)
	public ModelAndView getLog() {
		return new ModelAndView("login");
	}
	@RequestMapping(value="/update",method= RequestMethod.GET)
	public ModelAndView getUpdate(User user) {
		return new ModelAndView("update");
	}
	
	@RequestMapping(value="/addUser",method= RequestMethod.POST)
	public ModelAndView addUser(@RequestParam("rgfname") String fname,
			@RequestParam("rglname") String lname,
			@RequestParam("gender") String gender,
			@RequestParam("rgmail") String mail,
			@RequestParam("rgpwd") String password,
			@RequestParam("rgphone") int phone)
	{
		
		System.out.println(fname + "  " + lname + " " + gender + "  " + mail +" " + password + " " + phone);
		user = new User();
		user.setFname(fname);
		user.setLname(lname);
		user.setGender(gender);
		user.setEmail(mail);
		user.setPassword(password);
		user.setPhone(phone);
		
		userService.addUser(user);
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/sgn",method = RequestMethod.POST)
	public ModelAndView afterSignin(@RequestParam("lgmail") String email,@RequestParam("lgpassword") String password )
	{
		user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		User emp = userService.validateUser(user);
		if(emp==null) {
			
			ModelAndView mv = new ModelAndView("login");
			return mv.addObject("NOTIFICATION", "USER NOT Found :( ");	
		}else {
		
		return allUsers();
		}
	}
	
	public ModelAndView allUsers()
	{
		List<User> userList = userService.getAllUser();
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("ulist", userList);	
		
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public ModelAndView deleteUser(User user)
	{
		List<User> userList = userService.deleteUser(user.getUserId());
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("ulist", userList);	
		
	}
	
	@RequestMapping(value = "/updateUser",method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute User user)
	{
		List<User> userList = userService.updateUser(user);
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("ulist", userList);	
		
	}
	
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search(@RequestParam("searchById") int id)
	{
		User userById = userService.getUserById(id);
		if(userById == null) {
			ModelAndView mv = new ModelAndView("register");
			return mv.addObject("NOTIFICATION", "USER NOT Found :( ");
		}
		else {
		List<User> userList = new ArrayList<User>();
		userList.add(userById);
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("ulist", userList);	
		}
	}
}
