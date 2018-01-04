package com.niit.model;



	import java.io.Serializable;

import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import org.springframework.stereotype.Component;

	@Entity
	@Table(name="Users")
	@Component
	public class Customer implements Serializable{


		@Id
		private String email;

		private String password;

		private String fname;

		private String lname;

		private String add;
		
		private String number;
		
		private String role;
		
		
		
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getAdd() {
			return add;
		}

		public void setAdd(String add) {
			this.add = add;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		
	
}
