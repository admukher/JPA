package com.cg.authorbook.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

 





@Entity
@Table(name = "book_master")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int isbn;
	private String title;
	private int price;
/*
	@Temporal(TemporalType.DATE)	//required for Date and Calendar Types
	@Column(name = "order_date")
	private Date purchaseDate;*/

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author", joinColumns = 
{ @JoinColumn(name = "book_id") }, inverseJoinColumns = { @JoinColumn(name = "Author_id") })
	private Set<Author> author = new HashSet<>();	//required to avoid NullPointerException

	
	
	public void addAuthor(Author author) {
		this.getAuthor().add(author);
	}



	public int getIsbn() {
		return isbn;
	}



	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Set<Author> getAuthor() {
		return author;
	}



	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
}