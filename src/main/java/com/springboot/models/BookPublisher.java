package com.springboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class BookPublisher
{
	@Id
	@GeneratedValue(generator = "pub_seq")
	@SequenceGenerator(name = "pub_seq",initialValue = 1111,allocationSize = 1)
	private int pubid;
	@Column(length = 100)
	private String publisher;
	@Column(length = 20)
	private String phone;
	@Column(length = 100)
	private String email;
	public int getPubid() {
		return pubid;
	}
	public void setPubid(int pubid) {
		this.pubid = pubid;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}