package com.suraj.ProductWebApp.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Product;

@Service
public class ProductService 
{
	
	List<Product> products = Arrays.asList(
			new Product(101, "nokia", 150),
			new Product(102, "Apple", 160));
	
	public List<Product> getProducts()
	{
		return products;
	}
}
