package com.ecole.spring.entity;

import org.hibernate.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {
	
	@Id//(pour spécifier la clé primaire de la table)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;
	@Column(length =25,nullable = false)
	 private String nom;
	 
	 private Double price;
	 
	 //constructeur sans arguments
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 //constructeur avec arguments

	public Product(Integer id, String nom, Double price) {
		super();
		this.id = id;
		this.nom = nom;
		this.price = price;
	}
	//getter et setter afin de rendre les attributs private public
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	 
	 
	 
	 

}
