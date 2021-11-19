package com.amzon.cart.dao;

import java.util.List;

import com.amzon.cart.model.Product;

public interface ProductDao {

	public List<Product> findAll();  //Get
	
	public int updateProduct(int productId,Product product);  //Put  //Not correctly inserted
	
	public Product AddNewProduct(Product product);    //Post
	
	public void deleteProduct(int productId);        //delete

    public Product findProductById(int productId);

    public List<Product> findProductByProductName(String productName);
    
    public List<Product> findProductByCategoryName(String categoryName);
    
    public List<Product> findMaxandMinPriceProducts(double minPrice,double maxPrice);

    public List<Product> findAllProductByMaxPrice(double maxPrice);
}
