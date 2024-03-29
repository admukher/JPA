package com.cg.authorbook.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;



@Entity
@Table(name="author_master")
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	
	private String name;
	
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="author")
	private Set<Book> book = new HashSet<>();


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Book> getBook() {
		return book;
	}


	public void setAuthor(Set<Author> author) {
		this.book = book;
	}
	
	
	}

	
	
	
	

