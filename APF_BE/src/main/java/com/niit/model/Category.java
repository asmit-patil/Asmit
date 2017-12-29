package com.niit.model;
import java.io.Serializable;
import java.util.*;

//import org.hibernate.annotations.Entity;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Category {
	
	@Id
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcname() {
		return cname;
	}
	public void setcname(String cname) {
		this.cname = cname;
	}
	
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER, mappedBy="supplier")
	private Set<Product> product =new HashSet<Product>(0);
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	

}
