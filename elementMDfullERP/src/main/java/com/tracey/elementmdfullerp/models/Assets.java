package com.tracey.elementmdfullerp.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="assets")
public class Assets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, max=60, message="Month must be between 2 and 25 characters")
	@NotNull
	private String month;
	
	private Float checkingAcct;
	
	private Float savingsAcct;
	
	private Float pettyCash;
	
	private Float acctsRecievable;
	
	private Float inventory;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Assets() {
		// TODO Auto-generated constructor stub
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

	public Float getCheckingAcct() {
		return checkingAcct;
	}

	public void setCheckingAcct(Float checkingAcct) {
		this.checkingAcct = checkingAcct;
	}

	public Float getSavingsAcct() {
		return savingsAcct;
	}

	public void setSavingsAcct(Float savingsAcct) {
		this.savingsAcct = savingsAcct;
	}

	public Float getPettyCash() {
		return pettyCash;
	}

	public void setPettyCash(Float pettyCash) {
		this.pettyCash = pettyCash;
	}

	public Float getAcctsRecievable() {
		return acctsRecievable;
	}

	public void setAcctsRecievable(Float acctsRecievable) {
		this.acctsRecievable = acctsRecievable;
	}

	
	public Float getInventory() {
		return inventory;
	}

	public void setInventory(Float inventory) {
		this.inventory = inventory;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
    
    

}
