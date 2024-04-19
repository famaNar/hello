package com.ecole.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.spring.entity.Product;
import com.ecole.spring.repository.ProdactRepository;

@Service
public class ProductImpleService implements ProductService {
	@Autowired
	private ProdactRepository productRepo;

	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public String UpdateOrInsert(Product product) {
		productRepo.save(product);
		return "Success" ;
	}

	@Override
	public Product getById(Integer id) {
		Optional <Product>findById= productRepo.findById(id);
	
		if (findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		
		if(productRepo.existsById(id)) {
		productRepo.deleteById(id);
		return("Delete Sucess !");}		
		return null;
	}

}
