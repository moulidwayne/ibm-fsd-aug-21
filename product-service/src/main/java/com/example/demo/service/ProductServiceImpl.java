package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;
	

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product createProduct(Product product) {

		Product tempProduct=productRepository.save(product);
		return tempProduct;
	}

	@Override
	public List<Product> fetchAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
