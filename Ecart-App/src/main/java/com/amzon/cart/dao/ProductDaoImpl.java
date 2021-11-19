package com.amzon.cart.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amzon.cart.dao.util.DBquries;
import com.amzon.cart.model.Brand;
import com.amzon.cart.model.Category;
import com.amzon.cart.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	//Using Lambda Expression
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FETCH_ALL_PRODUCTS,(ResultSet rs)->{
			List<Product> list=new ArrayList<Product>();
			while(rs.next()) {
				Product product=new Product();
				Brand brand=new Brand();
				Category category=new Category();
				
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getDouble("product_price"));
				product.setQuantity(rs.getInt("quantity"));
				product.setDescription(rs.getString("description"));
				product.setKeyowrds(rs.getString("keywords"));
				
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setBrandName(rs.getString("brand_title"));
				
				category.setCategoryId(rs.getInt("category_id"));
				category.setCategoryName(rs.getString("category_title"));
			 
				product.setBrand(brand);
				product.setCategory(category);
				
				list.add(product);
			}
			return list;
		});
	}

	@Override
	public int updateProduct(int productId, Product product) {
		// TODO Auto-generated method stub
		
		int result=jdbcTemplate.update(DBquries.UPDATE_PRODUCT,product.getProductName(),
				product.getProductPrice(),product.getQuantity(),product.getDescription(),
				product.getKeyowrds(),productId);
		if(result==1) {
			return result;
		}
		return 0;
	}

	@Override
	public Product AddNewProduct(Product product) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(DBquries.ADD_NEW_PRODUCT,product.getProductId(),
				product.getProductName(),product.getProductPrice(),product.getQuantity(),
				product.getDescription(),product.getKeyowrds(),product.getBrand().getBrandId(),
				product.getCategory().getCategoryId());
		if(result!=0) {
			return product;
		}
		return null;
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(DBquries.DELETE_PRODUCT,productId);
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FIND_PRODUCT_BY_PRODUCT_ID,(ResultSet rs)->{
			if(rs.next()) {
				Product product =new Product();
				Brand brand=new Brand();
				Category category=new Category();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getDouble("product_price"));
				product.setQuantity(rs.getInt("quantity"));
				product.setDescription(rs.getString("description"));
				product.setKeyowrds(rs.getString("keywords"));
				
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setBrandName(rs.getString("brand_title"));
				
				category.setCategoryId(rs.getInt("category_id"));
				category.setCategoryName(rs.getString("category_title"));
				
				product.setBrand(brand);
				product.setCategory(category);
			
			return product;
				
			}
			return null;
		},productId);
	}

	@Override
	public List<Product> findProductByProductName(String productName) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FIND_PRODUCT_BY_PRODUCT_NAME,(ResultSet rs)->{
			List<Product> list=new ArrayList<Product>();
			while(rs.next()) {
			Product product=new Product();
			Brand brand=new Brand();
			Category category=new Category();
		    product.setProductId(rs.getInt("product_name"));
		    product.setProductName(rs.getString("product_name"));
		    product.setProductPrice(rs.getDouble("product_price"));
		    product.setQuantity(rs.getInt("quantity"));
		    product.setDescription(rs.getString("description"));
		    product.setKeyowrds(rs.getString("keywords"));
		    
		    brand.setBrandId(rs.getInt("brand_id"));
		    brand.setBrandName(rs.getString("brand_title"));
		    
		    category.setCategoryId(rs.getInt("category_id"));
		    category.setCategoryName(rs.getString("category_title"));
		    
		    product.setBrand(brand);
		    product.setCategory(category);
		    
		    
		    list.add(product);
			}
			return list;
		},productName);
		
	}

	@Override
	public List<Product> findProductByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FIND_PRODUCT_BY_CATEGORY_NAME,(ResultSet rs)->{
			List<Product> list=new ArrayList<Product>();
			while(rs.next()) {
			Product product=new Product();
			Brand brand=new Brand();
			Category category=new Category();
		    product.setProductId(rs.getInt("product_name"));
		    product.setProductName(rs.getString("product_name"));
		    product.setProductPrice(rs.getDouble("product_price"));
		    product.setQuantity(rs.getInt("quantity"));
		    product.setDescription(rs.getString("description"));
		    product.setKeyowrds(rs.getString("keywords"));
		    
		    brand.setBrandId(rs.getInt("brand_id"));
		    brand.setBrandName(rs.getString("brand_title"));
		    
		    category.setCategoryId(rs.getInt("category_id"));
		    category.setCategoryName(rs.getString("category_title"));
		    
		    product.setBrand(brand);
		    product.setCategory(category);
		    
		    list.add(product);
			}
			 return list;
		},categoryName);
	}

	@Override
	public List<Product> findMaxandMinPriceProducts(double minPrice, double maxPrice) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FIND_PRODUCT_BY_MAX_AND_MIN_PRICE,(ResultSet rs)->{
			List<Product> list=new ArrayList<Product>();
			while(rs.next()) {
			Product product=new Product();
			Brand brand=new Brand();
			Category category=new Category();
		    product.setProductId(rs.getInt("product_name"));
		    product.setProductName(rs.getString("product_name"));
		    product.setProductPrice(rs.getDouble("product_price"));
		    product.setQuantity(rs.getInt("quantity"));
		    product.setDescription(rs.getString("description"));
		    product.setKeyowrds(rs.getString("keywords"));
		    
		    brand.setBrandId(rs.getInt("brand_id"));
		    brand.setBrandName(rs.getString("brand_title"));
		    
		    category.setCategoryId(rs.getInt("category_id"));
		    category.setCategoryName(rs.getString("category_title"));
		    
		    product.setBrand(brand);
		    product.setCategory(category);
		    
		    list.add(product);
			}
			return list;
		},minPrice,maxPrice);
	}

	@Override
	public List<Product> findAllProductByMaxPrice(double maxPrice) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FIND_PRODUCT_BY_MAX_PRICE,(ResultSet rs)->{
			List<Product> list=new ArrayList<Product>();
			while(rs.next()) {
			Product product=new Product();
			Brand brand=new Brand();
			Category category=new Category();
		    product.setProductId(rs.getInt("product_name"));
		    product.setProductName(rs.getString("product_name"));
		    product.setProductPrice(rs.getDouble("product_price"));
		    product.setQuantity(rs.getInt("quantity"));
		    product.setDescription(rs.getString("description"));
		    product.setKeyowrds(rs.getString("keywords"));
		    
		    brand.setBrandId(rs.getInt("brand_id"));
		    brand.setBrandName(rs.getString("brand_title"));
		    
		    category.setCategoryId(rs.getInt("category_id"));
		    category.setCategoryName(rs.getString("category_title"));
		    
		    product.setBrand(brand);
		    product.setCategory(category);
		    
		    list.add(product);
			}
			return list;
		},maxPrice);
}
}
