package com.niit.model;
import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Category {
	
	@Id
	private int cid;
	private String categoryName;

}
