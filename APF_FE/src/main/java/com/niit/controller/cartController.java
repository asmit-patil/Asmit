package com.niit.controller;

import java.util.*;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DaoImpl.*;
import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.Order;
import com.niit.model.Product;
import com.niit.model.Supplier;


@Controller
public class cartController {

	@Autowired
	SupplierDaoImpl supplierDaoImpl;
	
	@Autowired
	CustomerDaoImpl customerDaoImpl;
	
	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	
	@Autowired
	ProductDaoImpl productDaoImpl;
	
	@Autowired
	CartDaoImpl cartDaoImpl;
	
	@Autowired
	OrderDaoImpl orderDaoImpl;
	
	@RequestMapping(value="/prodDetails", method=RequestMethod.POST)
	public ModelAndView prodDet(@PathVariable("pid")int pid)
	{
		ModelAndView mv= new ModelAndView();
		Product prod= productDaoImpl.findByPID(pid);
		mv.addObject("prod", prod);
		mv.setViewName("productDetails");
		return mv;
	}
	
	@RequestMapping(value="/addToCart", method=RequestMethod.POST)
	@Transactional
	public ModelAndView addtocart(HttpServletRequest request){
		 ModelAndView mv=new  ModelAndView();
		 Principal principal= request.getUserPrincipal();
		 String userEmail =principal.getName();
		 
		 try
		 {
			 int pid= Integer.parseInt(request.getParameter("pid"));
			 double price=Double.parseDouble(request.getParameter("pPrice"));
			 int qty=Integer.parseInt(request.getParameter("pQty"));
			 String pname=request.getParameter("pname");
			 String imgName=request.getParameter("imgName");
			 Cart cartExist= cartDaoImpl.getCartById(pid, userEmail);
			 if(cartExist== null)
			 {
				Cart c=new Cart();
				c.setCartPrice(price);
				c.setCartProductId(pid);
				c.setCartStock(qty);
				c.setCartImage(imgName);
				c.setCartProductName(pname);
				
				Customer cust=customerDaoImpl.findUserByEmail(userEmail);
				c.setCartUserDetails(cust);
				cartDaoImpl.insert(c);
			 }
			 else if (cartExist != null)
			 {
				 Cart c=new Cart();
				 c.setCartId(cartExist.getCartId());
				 c.setCartPrice(price);
				 c.setCartProductId(pid);
				 c.setCartStock(cartExist.getCartStock()+qty);
				 c.setCartImage(imgName);
				 c.setCartProductName(pname);
					
				 Customer cust=customerDaoImpl.findUserByEmail(userEmail);
				 c.setCartUserDetails(cust);
					cartDaoImpl.updateCart(c);
			 }
			 
			 mv.addObject("cartInfo",cartDaoImpl.findByCartId(userEmail));
			 mv.setViewName("cart");
			 return mv;
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 mv.addObject("cartInfo",cartDaoImpl.findByCartId(userEmail));
			 mv.setViewName("cart");
			 return mv;
			 
		 }
	}
	
	@RequestMapping(value="/checkout", method=RequestMethod.GET)
	public ModelAndView checkoutprocess(HttpServletRequest req){
		 ModelAndView mv=new  ModelAndView();
		 Principal principal= req.getUserPrincipal();
		 String userEmail =principal.getName();
		 
		 Customer c=customerDaoImpl.findUserByEmail(userEmail);
		 List<Cart> cart= cartDaoImpl.findByCartId(userEmail);
		 mv.addObject("customer",c);
		 mv.addObject("cart",cart);
		 return mv;
	}
	
	
	@RequestMapping(value="/orderprocess", method=RequestMethod.GET)
	public ModelAndView orderprocess(HttpServletRequest req){
		 ModelAndView mv=new  ModelAndView();
		 Order order=new Order();
		 Principal principal= req.getUserPrincipal();
		 String userEmail =principal.getName();
		 
		 Double total= Double.parseDouble(req.getParameter("total"));
		 String payment=req.getParameter("payment");
		 
		 Customer c= customerDaoImpl.findUserByEmail(userEmail);
		 order.setUser(c);
		 order.setTotal(total);
		 order.setPayment(payment);
		 orderDaoImpl.insert(order);
		 mv.addObject("orderDetails",c);
		 mv.setViewName("ack");
		 return mv;
		 
	
	}
	
	
	
	
}
