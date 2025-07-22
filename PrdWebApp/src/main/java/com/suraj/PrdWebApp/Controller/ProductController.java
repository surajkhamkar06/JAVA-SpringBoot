package com.suraj.PrdWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.PrdWebApp.Service.ProductService;

import Model.Product;

@RestController
public class ProductController 
{
	@Autowired
	ProductService service;
	
	@RequestMapping("prd")
	public List<Product> getProducts()
	{
		return service.getProducts();
	}
}
