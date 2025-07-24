package com.suraj.PrdWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.PrdWebApp.Service.ProductService;

import Model.Product;

@RestController
public class ProductController 
{
	@Autowired
	ProductService service;

	@GetMapping("prd")
	public List<Product> getProducts()
	{
		return service.getProducts();
	}


	@GetMapping("/prd/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return service.getProductById(id);
	}


	@PostMapping("/prd")
	public void addProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		service.addProduct(prod);
	}

	@PutMapping("/prd")
	public void updateProduct(@RequestBody Product prod) 
	{
		service.updateProduct(prod);

	}
	
	@DeleteMapping("/prd/{prodId}")
	public void deleteProduct(@PathVariable int prodId)
	{
		service.deleteProduct(prodId);
	}
}
