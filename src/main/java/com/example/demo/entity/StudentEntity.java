package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student")
public class StudentEntity {

	@Id
	private Integer id;
	private String name;
	private String address;
	private String postalcode;
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(Integer id, String name, String address, String postalcode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.postalcode = postalcode;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", address=" + address + ", postalcode=" + postalcode
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
