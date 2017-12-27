package com.niit.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.*;
import com.niit.DaoImpl.UserDaoImpl;
import com.niit.model.*;

public class userController {
	public static Logger log = LoggerFactory.getLogger(UserDaoImpl.class);
	@Autowired
	private UserDao userDAO;

	@Autowired
	private User user;
	
	@Autowired
	//private HttpSession session;
	SessionFactory session;
	@RequestMapping(value = "/signup",method = RequestMethod.POST)
	public ModelAndView signup(@ModelAttribute User user) {
		log.debug("Starting of the method registerUser");
		System.out.println("Starting of the method registerUser"+user.getId());
		ModelAndView mv = new ModelAndView("/index");
		if (userDAO.getUserById(user.getId()) == null) {
			user.setRole("ROLE_USER");
			userDAO.save(user);
			log.debug("You are successfully register");
		} else {
			log.debug("User exist with this id");
		}
		log.debug("Ending of the method registerUser");
		return mv;
	}
	
}
