package com.microservice.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE")
    private long price;

    @Column(name = "QUANTITY")
    private long quantity;

	// public Product(long productId, String productName, long price, long quantity) {
	// 	super();
	// 	this.productId = productId;
	// 	this.productName = productName;
	// 	this.price = price;
	// 	this.quantity = quantity;
	// }

	// public Product(String name, long quantity2, long price2) {
	// 	// TODO Auto-generated constructor stub
	// 	super();
	// 	this.productName = name;
	// 	this.price = price2;
	// 	this.quantity = quantity2;
	// }


}