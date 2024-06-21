package com.ts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;

@RestController
public class ProductController {

	@RequestMapping("getProduct")
	public Product getProduct() {
		Product product = new Product();
		product.setProdId(1001);
		product.setProdName("Laptop");
		product.setPrice(45999.99);
		return product;
	}
	
	
	@RequestMapping("getProducts")
	public List<Product> getProducts() {
		
		Product product1 = new Product(1001, "Laptop", 45000.00);
		Product product2 = new Product(1002, "Mobile", 85000.00);
		Product product3 = new Product(1003, "Pendrive", 500.00);
		
		List productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}
}




