package com.amzon.cart.dao.util;

public class DBquries {

	public static final String FETCH_ALL_PRODUCTS="select * from products p inner join brands b on p.brand_id=b.brand_id inner join categories c on p.category_id=c.category_id";
    
	public static final String UPDATE_PRODUCT="update products set product_name=?,product_price=?,quantity=?,description=?,keywords=? where product_id=?";

	public static final String ADD_NEW_PRODUCT="insert into products values(?,?,?,?,?,?,?,?)";
	
	public static final String DELETE_PRODUCT="delete from products where product_id=?";
	
	public static final String FIND_PRODUCT_BY_PRODUCT_ID="select * from products p inner join brands b on p.brand_id=b.brand_id inner join categories c on p.category_id=c.category_id where p.product_id=?";
	
	public static final String FIND_PRODUCT_BY_PRODUCT_NAME="select * from products p inner join brands b on p.brand_id=b.brand_id inner join categories c on p.category_id= c.category_id where p.product_name=?";
	
	public static final String FIND_PRODUCT_BY_CATEGORY_NAME="select * from products p inner join brands b on p.brand_id=b.brand_id inner join categories c on p.category_id=c.category_id where c.category_title=?";
	
	public static final String FIND_PRODUCT_BY_MAX_AND_MIN_PRICE="select * from products p inner join brands b on p.brand_id=b.brand_id inner join categories c on p.category_id=c.category_id where p.product_price>=? and p.product_price<=?";
    
	public static final String FIND_PRODUCT_BY_MAX_PRICE="select * from products p inner join brands b on p.brand_id=b.brand_id inner join categories c on p.category_id=c.category_id where p.product_price>=?";

}
