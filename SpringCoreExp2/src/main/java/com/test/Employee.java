package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

public class Employee {
	private int id;
	private String name;
	private String company;
	@Autowired
//	@Scope(scopeName = "singleton")
	private List<Address> add; 
	public List<Address> getAdd() {
		return add;
	}
	public void setAdd(List<Address> add) {
		this.add = add;
	}
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", \n add=" + add + "]";
	}
	
	
	}
	

