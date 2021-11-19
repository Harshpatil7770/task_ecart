package com.amzon.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amzon.cart.dao.ProductDao;
import com.amzon.cart.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll() ;
	}

	@Override
	public int updateProduct(int productId, Product product) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(productId, product);
	}

	@Override
	public Product addNewProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.AddNewProduct(product);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(productId);
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.findProductById(productId);
	}

	@Override
	public List<Product> findProductByProductName(String productName) {
		// TODO Auto-generated method stub
		return productDao.findProductByProductName(productName);
	}

	@Override
	public List<Product> findProductByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return productDao.findProductByCategoryName(categoryName);
	}

	@Override
	public List<Product> findMaxandMinPriceProducts(double minPrice, double maxPrice) {
		// TODO Auto-generated method stub
		return productDao.findMaxandMinPriceProducts(minPrice, maxPrice);
	}

	@Override
	public List<Product> findAllProductByMaxPrice(double maxPrice) {
		// TODO Auto-generated method stub
		return productDao.findAllProductByMaxPrice(maxPrice);
	}

}
