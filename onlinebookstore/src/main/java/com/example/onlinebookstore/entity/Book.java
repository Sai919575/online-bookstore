package com.example.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String sku;

	private String name;
	
	public Long getId() {
		return id;
	}






	@Override
	public String toString() {
		return "Book [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", unitPrice="
				+ unitPrice + ", ImageUrl=" + ImageUrl + ", active=" + active + ", unitsInStock=" + unitsInStock
				+ ", date_created=" + date_created + ", last_updated=" + last_updated + ", category=" + category + "]";
	}






	public void setId(Long id) {
		this.id = id;
	}






	public String getSku() {
		return sku;
	}






	public void setSku(String sku) {
		this.sku = sku;
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






	public void setDescription(String description) {
		this.description = description;
	}






	public BigDecimal getUnitPrice() {
		return unitPrice;
	}






	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}






	public String getImageUrl() {
		return ImageUrl;
	}






	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}






	public boolean isActive() {
		return active;
	}






	public void setActive(boolean active) {
		this.active = active;
	}






	public int getUnitsInStock() {
		return unitsInStock;
	}






	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}






	public Date getDate_created() {
		return date_created;
	}






	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}






	public Date getLast_updated() {
		return last_updated;
	}






	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}






	public BookCategory getCategory() {
		return category;
	}






	public void setCategory(BookCategory category) {
		this.category = category;
	}






	private String description;
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	@Column(name="image_url")
	private String ImageUrl;
	
	private boolean active;
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	private Date date_created;
	
	private Date last_updated;
	
	

	


	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;

}
