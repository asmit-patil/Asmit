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
	private String suppllierName;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSuppllierName() {
		return suppllierName;
	}
	public void setSuppllierName(String suppllierName) {
		this.suppllierName = suppllierName;
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
