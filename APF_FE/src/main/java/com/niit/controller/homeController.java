package com.niit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DaoImpl.*;
import com.niit.model.User;

@Controller
public class homeController {


	/*@Autowired
	 UserDaoImpl userDaoImpl;*/
	
	@Autowired
	 ProductDaoImpl productDaoImpl;
	
	@Autowired
	 CategoryDaoImpl categoryDaoImpl;
	
@RequestMapping("/")
	public String home()
{
	return "index";
}

/*@RequestMapping(value="/goToRegister", method=RequestMethod.GET)
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
}*/

@RequestMapping(value="/productCustList")
public ModelAndView getCustTable(@RequestParam("cid") int cid){
	ModelAndView  mv= new ModelAndView ();
	mv.addObject("prodList", productDaoImpl.findprodByCatId(cid));
	mv.setViewName("productCustList");
	return mv;
}	
@ModelAttribute
public void getData(Model m)
{
	m.addAttribute("catList", categoryDaoImpl.retrive());
	
}
	
}

