package com.microservice.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderId;
	private String orderDesc;
	private Date orderDate;
	private int custId;
	public Order() {
		
	}
	public Order(int orderId, String orderDesc, Date orderDate, int custId) {
		this.orderId = orderId;
		this.orderDesc = orderDesc;
		this.orderDate = orderDate;
		this.custId = custId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
}
