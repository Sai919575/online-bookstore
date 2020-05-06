package com.example.onlinebookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_category")
@Getter
@Setter
@ToString
public class BookCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="category_name")
	private String categoryName;
	


	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", categoryName=" + categoryName + ", book=" + book + "]";
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	public Set<Book> getBook() {
		return book;
	}



	public void setBook(Set<Book> book) {
		this.book = book;
	}



	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<Book> book;
	
	
}