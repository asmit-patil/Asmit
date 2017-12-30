package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
			return "adding";
		}
		
	@RequestMapping(value="/saveSupp", method=RequestMethod.POST)
	@Transactional
	public ModelAndView saveSuppData(@RequestParam("sid")int sid,@RequestParam("sname")String sname){
		 ModelAndView mv=new  ModelAndView();
		 Supplier s=new Supplier();
		 s.setSid(sid);
		 s.setsname(sname);
		 supplierDaoImpl.insertSupplier(s);
		 mv.setViewName("adding");
		 return mv;
	}
	
	@RequestMapping(value="/saveCat", method=RequestMethod.POST)
	@Transactional
	public ModelAndView saveCatData(@RequestParam("cid")int cid,@RequestParam("cname")String cname){
		 ModelAndView mv=new  ModelAndView();
		 Category c=new Category();
		 c.setCid(cid);
		 c.setcname(cname);
		 categoryDaoImpl.insertCategory(c);
		 mv.setViewName("adding");
		 return mv;
	
		 
		 
	}
	
	@RequestMapping(value="/saveProduct", method=RequestMethod.POST)
	//@Transactional
	public String saveProd(HttpServletRequest request, @RequestParam("file")MultipartFile file)
	{
		Product prod = new Product();
		prod.setPname(request.getParameter("pName"));
		prod.setPrice(Double.parseDouble(request.getParameter("pPrice")));
		prod.setDescription(request.getParameter("pDescrition"));
		prod.setStock(Integer.parseInt(request.getParameter("pStock")));
		String cat=request.getParameter("pCategory");
		String sat=request.getParameter("pSupplier");
		prod.setCategory(categoryDaoImpl.findByCatId(Integer.parseInt(cat)));
		prod.setSupplier(supplierDaoImpl.findBySuppId(Integer.parseInt(sat)));
		
		String filepath=request.getSession().getServletContext().getRealPath("/");
		String filename=file.getOriginalFilename();
		productDaoImpl.insertProduct(prod);
		System.out.println("file path"+filepath);
		try{
			byte imagebyte[]=file.getBytes();
			BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(filepath+"resources/images/"+filename));
			fos.write(imagebyte);
			fos.close();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		return "adding";
	}
	
	@ModelAttribute
	public void loadingDataInPage(Model m){
		m.addAttribute("satList", supplierDaoImpl.retrive());
		m.addAttribute("catList", categoryDaoImpl.retrive());
		m.addAttribute("prodList", productDaoImpl.retrive());
	}
	
	@RequestMapping("/productList")
	public ModelAndView prodlist()
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("prodList", productDaoImpl.retrive());
		mv.setViewName("productAdminList");
		return mv;
	}
	
	@RequestMapping("/supplierList")
	public ModelAndView supplist()
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("satList", supplierDaoImpl.retrive());
		mv.setViewName("suppAdminList");
		return mv;
	}
	
	@RequestMapping("/categoryList")
	public ModelAndView catlist()
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("catList", categoryDaoImpl.retrive());
		mv.setViewName("categoryAdminList");
		return mv;
	}
	
	@RequestMapping("/deleteProd/{pid}")
	public String deleteProduct(@PathVariable("pid")int pid)
	{
		productDaoImpl.deleteProd(pid);
		return "redirect/productList?del";
	}
	
	@RequestMapping("/updateProd")
	public ModelAndView updateProduct(@RequestParam("pid")int pid)
	{
		ModelAndView mv= new ModelAndView();
		Product p=productDaoImpl.findByPID(pid);
		mv.addObject("prod",p);
		mv.addObject("catList", categoryDaoImpl.retrive());
		mv.addObject("satList", supplierDaoImpl.retrive());
		mv.setViewName("updateProduct");
		return mv;
	}
	
	@RequestMapping(value="/productUpdate", method=RequestMethod.POST)
	//@Transactional
	public String udateProd(HttpServletRequest request, @RequestParam("file")MultipartFile file)
	{
		Product prod = new Product();
		prod.setPid(Integer.parseInt(request.getParameter("pid")));
		prod.setPname(request.getParameter("pName"));
		prod.setPrice(Double.parseDouble(request.getParameter("pPrice")));
		prod.setDescription(request.getParameter("pDescrition"));
		prod.setStock(Integer.parseInt(request.getParameter("pStock")));
		String cat=request.getParameter("pCategory");
		String sat=request.getParameter("pSupplier");
		prod.setCategory(categoryDaoImpl.findByCatId(Integer.parseInt(cat)));
		prod.setSupplier(supplierDaoImpl.findBySuppId(Integer.parseInt(sat)));
		
		String filepath=request.getSession().getServletContext().getRealPath("/");
		String filename=file.getOriginalFilename();
		productDaoImpl.insertProduct(prod);
		System.out.println("file path"+filepath);
		try{
			byte imagebyte[]=file.getBytes();
			BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(filepath+"resources/images/"+filename));
			fos.write(imagebyte);
			fos.close();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		return "redirect:/productList?update";
	}
	
	
}
