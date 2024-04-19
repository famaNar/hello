package com.ecole.spring.service;

import java.util.List;

import com.ecole.spring.entity.Product;

//toute interface on l'implemente c'est pour ca qu'on cree le serviceImpl et cela englobe  toute les methodes
public interface ProductService {
	
	public List<Product> getAllProduct();
	public String UpdateOrInsert(Product produit);
	public Product getById(Integer id);
	public String deleteById(Integer id);

}
