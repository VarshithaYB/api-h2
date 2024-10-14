package com.ust.rest.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//this is to store information-ERP
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	
	@Id
	private long Id;
	private String brand;
	private String description;
	private int qty;
	private int price;
	
	
	

}

