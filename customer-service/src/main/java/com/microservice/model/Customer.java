package com.microservice.model;

public class Customer {
	private int custId;
	private String name;
	private String type;
	private long noOfOrders;
	public Customer(String name, int custId, String type, long  noOfOrders) {
		this.name = name;
		this.custId = custId;
		this.noOfOrders = noOfOrders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public long getNoOfOrders() {
		return noOfOrders;
	}
	public void setNoOfOrders(long noOfOrders) {
		this.noOfOrders = noOfOrders;
	}
	
}
