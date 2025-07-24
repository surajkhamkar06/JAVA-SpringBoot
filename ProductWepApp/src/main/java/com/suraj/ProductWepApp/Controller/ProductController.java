package com.suraj.ProductWepApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.ProductWebApp.Service.ProductService;

import model.Product;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	@RequestMapping("/prd")
	public List<Product> getProducts()
	{
		return service.getProducts();
	}
}