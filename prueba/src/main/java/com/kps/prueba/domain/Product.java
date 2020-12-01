package com.kps.prueba.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	
	private int productId;
	private String name;
	private int categoryID;
	private double price;
	private int stock;
	private boolean active;
	private Category category;
	
}
