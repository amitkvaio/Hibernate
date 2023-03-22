package com.premitive;

public class Product {
	private int id;
	private String pname;
	private int pprice;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getPname() {
		return pname;
	}

	protected void setPname(String pname) {
		this.pname = pname;
	}

	protected int getPprice() {
		return pprice;
	}

	protected void setPprice(int pprice) {
		this.pprice = pprice;
	}
}
