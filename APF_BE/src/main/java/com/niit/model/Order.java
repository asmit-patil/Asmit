package com.niit.model;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Order implements Serializable{


	@Id
	@GeneratedValue
	private int orderId;
	
	@ManyToOne
	@JoinColumn
	private Customer user;
	
	private String payment;
	
	private double total;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getUser() {
		return user;
	}

	public void setUser(Customer user) {
		this.user = user;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
}
