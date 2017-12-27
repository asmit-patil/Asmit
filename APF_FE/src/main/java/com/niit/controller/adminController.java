package com.niit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DaoImpl.*;
import com.niit.model.*;
@Controller
public class adminController {

	@Autowired
	SupplierDaoImpl supplierDaoImpl;
	

	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	
	@Autowired
	ProductDaoImpl productDaoImpl;
	
		@RequestMapping("/adding")
		public String adding(){
			return "Adding";
		}
		
	@RequestMapping(value="/saveSupp", method=RequestMethod.POST)
	@Transactional
	public ModelAndView saveSuppData(@RequestParam("sid")int sid,@RequestParam("name")String sname){
		 ModelAndView mv=new  ModelAndView();
		 Supplier s=new Supplier();
		 s.setSid(sid);
		 s.setSuppllierName(sname);
		 supplierDaoImpl.insertSupplier(s);
		 mv.setViewName("adding");
		 return mv;
	}
	
	@RequestMapping(value="/saveCat", method=RequestMethod.POST)
	@Transactional
	public ModelAndView saveCatData(@RequestParam("cid")int cid,@RequestParam("name")String cname){
		 ModelAndView mv=new  ModelAndView();
		 Category c=new Category();
		 c.setCid(cid);
		 c.setCategoryName(cname);
		 categoryDaoImpl.insertCategory(c);
		 mv.setViewName("adding");
		 return mv;
	}
	
//	@RequestMapping(value="/saveProduct", method=RequestMethod.POST)
//	//@Transactional
//	public String saveProd(HttpServletRequest request, @RequestParam("file")MultipartFile file)
//	{
//		Product prod = new Product();
//		prod.setPname(request.getParameter("pName"));
//		prod.setPrice(Double.parseDouble(request.getParameter("pPrice")));
//		prod.setDescription(request.getParameter("pDescrition"));
//		prod.setStock(Integer.parseInt(request.getParameter("pStock")));
//		prod.setCategory(CategoryDaoImpl.findByCatId(Integer.parseInt(request.getParameter("pCategory"))));
//		prod.setSupplier(SupplierDaoImpl.findBySuppId(Integer.parseInt(request.getParameter("pSupplier"))));
//	}
//	
//	
}
