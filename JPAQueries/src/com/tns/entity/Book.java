package com.tns.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="books")
@NamedQueries(@NamedQuery(name = "getAllBooks", query = "SELECT book FROM Book book"))//frequently used query

public class Book implements Serializable {
	
	private static final long serialversionUID = 1L;
	@Id
	private Integer id; //primary key
	private String title;
	private String author;
	private double price;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	

}
