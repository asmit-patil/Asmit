package com.niit.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.niit.DaoImpl.CategoryDaoImpl;
import com.niit.DaoImpl.CustomerDaoImpl;
import com.niit.DaoImpl.ProductDaoImpl;
//import com.niit.DaoImpl.UserDaoImpl;
import com.niit.model.Category;
import com.niit.model.Customer;


@Controller
public class homeController {


	
	@Autowired
	CustomerDaoImpl customerDaoImpl;

	@Autowired
	 ProductDaoImpl productDaoImpl;
	
	@Autowired
	 CategoryDaoImpl categoryDaoImpl;
	
@RequestMapping("/")
	public String home()
{
	return "index";
}
@RequestMapping("/index")
public String index()
{
return "index";
}

@RequestMapping("/goToRegister")
public String register()
{
return "register";
}


	
@RequestMapping(value="/goToRegister", method=RequestMethod.GET)
public ModelAndView Register(){
	ModelAndView  mv= new ModelAndView ();
	mv.addObject("cust",new Customer());
	mv.setViewName("register");
	return mv;
}

@RequestMapping(value="/saveRegister", method=RequestMethod.POST)
public ModelAndView saveRegister(@ModelAttribute("user")Customer user){
	ModelAndView  mv= new ModelAndView();
	user.setRole("ROLE_USER");
	
	customerDaoImpl.insertCustomer(user);
	mv.setViewName("index");
	return mv;
}

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

@RequestMapping("/goToLogin")
public String login()
{
return "login";
}
	
@RequestMapping("/userLogged")
public String userLogged()
{
return "redirect:/index";
}

@RequestMapping("/error")
public String error()
{
return "error";
}

}

