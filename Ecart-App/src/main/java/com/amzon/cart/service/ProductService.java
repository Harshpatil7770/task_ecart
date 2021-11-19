package com.amzon.cart.service;

import java.util.List;

import com.amzon.cart.model.Product;

public interface ProductService {

	public List<Product> findAll();
	
	public int updateProduct(int productId,Product product);
	
	public Product addNewProduct(Product product);
	
	public void deleteProduct(int productId); 
	
	public Product findProductById(int productId);
	
	public List<Product> findProductByProductName(String productName);
	
	public List<Product> findProductByCategoryName(String categoryName);
	
    public List<Product> findMaxandMinPriceProducts(double minPrice,double maxPrice);
    
    public List<Product> findAllProductByMaxPrice(double maxPrice);
}
