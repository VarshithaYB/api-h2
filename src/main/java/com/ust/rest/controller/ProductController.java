package com.ust.rest.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Product;
import com.ust.rest.service.ProductService;

@RestController //Controller+responseBody //Spring MVC-Response-we return a ViewResolver-write to body of html
@RequestMapping("/product/api1.0")
public class ProductController {
	
	Logger logger=Logger.getLogger("ProductController.class");
	
     @Autowired
    ProductService service;
	
	
	@GetMapping(value="/product/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getById(@PathVariable ("id") long id)
	{
		return null;
	}
//	@GetMapping(value="/product/brand",produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Product> getByBrand(@RequestBody String brand)
//	{
//		Optional<Product> optional =productList.stream().filter(product->product.getBrand()==brand).findFirst();
//		return ResponseEntity.status(HttpStatus.OK).body(optional.get());
//	}
	
	
	@PostMapping(value="/addProduct",consumes=MediaType.APPLICATION_JSON_VALUE
			,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addproduct(@RequestBody Product product)
	{
		//Product savedproduct=service.addProduct(product);
		logger.info("EnteredPost Method"+product);
		Product savedProduct=service.addProduct(product);
		logger.info("Persistance Product"+savedProduct);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedProduct);
	}
	
	
	@PutMapping(value="/modify",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product)
	{
		return null;
		
		
		
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void removeProduct(@PathVariable ("id") long id)
	{
		
	}
	
	
	@GetMapping(value="/productsinfo",produces=MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<List<Product>> displayProducts()
     {
		return null;
     }
}
