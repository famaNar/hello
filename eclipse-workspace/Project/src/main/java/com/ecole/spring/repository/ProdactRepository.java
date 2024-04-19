package com.ecole.spring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecole.spring.entity.Product;

@Repository

public interface ProdactRepository extends JpaRepository<Product, Serializable> {

}
