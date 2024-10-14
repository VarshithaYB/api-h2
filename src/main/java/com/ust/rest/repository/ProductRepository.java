package com.ust.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.model.Product;

@Repository //@Component
public interface ProductRepository extends JpaRepository<Product,Long>{

	
	
}
