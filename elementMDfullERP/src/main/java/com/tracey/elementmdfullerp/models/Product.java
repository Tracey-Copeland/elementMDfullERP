package com.tracey.elementmdfullerp.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, max=60, message="Name must be between 2 and 60 characters")
	@NotNull
	private String name;
	
	private BigDecimal avgPrice;
	
	private Integer amountInStock;
	
	@OneToMany(mappedBy = "product", fetch=FetchType.LAZY)
	private List<ProductMaterial> productmaterials;
	
	@OneToMany(mappedBy = "product", fetch=FetchType.LAZY)
	private List<SalesOrder> salesOrders;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Product() {
	}
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmountInStock() {
		return amountInStock;
	}

	public void setAmountInStock(Integer amountInStock) {
		this.amountInStock = amountInStock;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public List<ProductMaterial> getProductmaterials() {
		return productmaterials;
	}

	public void setProductmaterials(List<ProductMaterial> productmaterials) {
		this.productmaterials = productmaterials;
	}

	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}

	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}

	public BigDecimal getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(BigDecimal avgPrice) {
		this.avgPrice = avgPrice;
	}
	
	
	
    
    

}
