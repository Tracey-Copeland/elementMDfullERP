package com.tracey.elementmdfullerp.models;

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
@Table(name="materials")
public class Material {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, max=60, message="Name must be between 2 and 60 characters")
	@NotNull
	private String name;
	
	private String description;
	
	private Integer amountInStock;
	
	@OneToMany(mappedBy = "material", fetch=FetchType.LAZY)
	private List<SingleProductionOrderMaterial> singleproductionordermaterials;
	
	@OneToMany(mappedBy = "material", fetch=FetchType.LAZY)
	private List<ProductMaterial> productmaterials;
	
	@OneToMany(mappedBy = "material", fetch=FetchType.LAZY)
	private List<PurchaseOrder> purchaseOrders;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	public Material() {
		// TODO Auto-generated constructor stub
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


	public String getDescription() {
		return description;
	}

	

	public List<SingleProductionOrderMaterial> getSingleproductionordermaterials() {
		return singleproductionordermaterials;
	}


	public void setSingleproductionordermaterials(List<SingleProductionOrderMaterial> singleproductionordermaterials) {
		this.singleproductionordermaterials = singleproductionordermaterials;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


	public Integer getAmountInStock() {
		return amountInStock;
	}


	public void setAmountInStock(Integer amountInStock) {
		this.amountInStock = amountInStock;
	}


	public List<ProductMaterial> getProductmaterials() {
		return productmaterials;
	}


	public void setProductmaterials(List<ProductMaterial> productmaterials) {
		this.productmaterials = productmaterials;
	}


	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}


	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}
	
	
	
}
