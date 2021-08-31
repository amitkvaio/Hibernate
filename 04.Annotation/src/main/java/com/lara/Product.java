package com.lara;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product
{
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "proName")
	private String proName;

	@Column(name = "price")
	private double price;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getProName()
	{
		return proName;
	}

	public void setProName(String proName)
	{
		this.proName = proName;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

}
