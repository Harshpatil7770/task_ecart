package com.amzon.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amzon.cart.model.Product;
import com.amzon.cart.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> findAll() {
		return productService.findAll();
	}
	
	@PutMapping("/updateProduct/{productId}")
	public int updateProduct (@PathVariable int productId,@RequestBody Product product) {
		return productService.updateProduct(productId, product);
	}
	
	@PostMapping
	public Product addNewProduct(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
	}
	
	@GetMapping("/{productId}")
	public Product findProductById(@PathVariable int productId) {
		return productService.findProductById(productId);
	}
	
	@GetMapping("/filter/{productName}")
	public List<Product> findProductByProductName(@PathVariable String productName) {
		return productService.findProductByProductName(productName);
	}
	
	@GetMapping("/filter/product/{categoryName}")
	public List<Product>findProductByCategoryName(@PathVariable String categoryName){
		return productService.findProductByCategoryName(categoryName);
	}
	
	@GetMapping("/filter/byPrice/{minPrice}/{maxPrice}")
    public List<Product> findMaxandMinPriceProducts(@PathVariable double minPrice,@PathVariable double maxPrice){
		return productService.findMaxandMinPriceProducts(minPrice, maxPrice);
	}
	
	@GetMapping("/filter/price/{maxPrice}")
	public List<Product> findAllProductByMaxPrice(@PathVariable double maxPrice){
		return productService.findAllProductByMaxPrice(maxPrice);
	}
}
