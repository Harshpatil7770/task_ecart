package com.amzon.cart.model;

public class Product {

	private int productId;
	
	private String productName;
	
	private double productPrice;
	
	private int quantity;
	
	private String description;
	
	private String keyowrds;
	
	private Brand brand;
	
	private Category category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double productPrice, int quantity, String description,
			String keyowrds, Brand brand, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.description = description;
		this.keyowrds = keyowrds;
		this.brand = brand;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeyowrds() {
		return keyowrds;
	}

	public void setKeyowrds(String keyowrds) {
		this.keyowrds = keyowrds;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", description=" + description + ", keyowrds=" + keyowrds + ", brand="
				+ brand + ", category=" + category + "]";
	}
	
	
	
	
}
