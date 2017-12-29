package com.niit.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Supplier implements Serializable{

	
	@Id
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsname() {
		return sname;
	}
	public void setsname(String sname) {
		this.sname = sname;
	}
	
	
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER, mappedBy="category")
	private Set<Product> product =new HashSet<Product>(0);
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
}
