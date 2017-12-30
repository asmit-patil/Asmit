/*package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.niit.Dao.UserDao;
import com.niit.DaoImpl.UserDaoImpl;
import com.niit.model.User;

@Controller
public class userController {
	
	@Autowired
	UserDaoImpl userDaoImpl;
	
	@RequestMapping(value="/goToRegister", method=RequestMethod.GET)
	public ModelAndView Register(){
		ModelAndView  mv= new ModelAndView ();
		mv.addObject("user",new User());
		mv.setViewName("register");
		return mv;
	}

	@RequestMapping(value="/saveRegister", method=RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("user")User user){
		ModelAndView  mv= new ModelAndView ();
		user.setRole("ROLE_USER");
		userDaoImpl.insertUser(user);
		mv.setViewName("index");
		return mv;
	}

}
*/