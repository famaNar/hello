package com.ecole.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.spring.entity.Product;
import com.ecole.spring.service.ProductService;
 
@RestController
@RequestMapping("/api/produit")

public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/listProduit")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> allProduct=productService.getAllProduct();
		return new ResponseEntity<>(allProduct, HttpStatus.OK);
		
	}
	@PostMapping("/addProduit")
	public ResponseEntity<String> createPRoduct(@RequestBody Product produit) 
	{
		String status=productService.UpdateOrInsert(produit);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	@PutMapping("/putProduct")
	public ResponseEntity<String> updatePRoduct(@RequestBody Product produit) 
	{
		String status=productService.UpdateOrInsert(produit);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	@GetMapping("product/{id}")
	 public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
		Product product = productService.getById(id);
		
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@DeleteMapping("product/{id}")
	public ResponseEntity<String> deletePRoduct(@PathVariable Integer id) 
	{
		String status=productService.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
