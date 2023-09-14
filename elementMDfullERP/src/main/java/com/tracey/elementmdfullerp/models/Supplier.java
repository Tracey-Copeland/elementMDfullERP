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
@Table(name="suppliers")
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, max=60, message="Name must be between 2 and 60 characters")
	@NotNull
	private String name;
	
	@Size(min=2, max=60, message="Name must be between 2 and 60 characters")
	@NotNull
	private String contactName;
	
	private Long contactPhoneNum;
	
	private Long companyPhoneNum;
	
	private String location;
	
	@OneToMany(mappedBy = "supplier", fetch=FetchType.LAZY)
	private List<PurchaseOrder> purchaseOrders;

	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Supplier() {
		
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}


	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public Long getContactPhoneNum() {
		return contactPhoneNum;
	}


	public void setContactPhoneNum(Long contactPhoneNum) {
		this.contactPhoneNum = contactPhoneNum;
	}


	public Long getCompanyPhoneNum() {
		return companyPhoneNum;
	}


	public void setCompanyPhoneNum(Long companyPhoneNum) {
		this.companyPhoneNum = companyPhoneNum;
	}
	
	
	
	
    

}
