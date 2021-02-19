package com.src;

import java.util.List;

public class Customer {
	
	private String cid;
	private String cname;
	private long cmob;
	private List<Item> Item;
	private Address add;
	
	
	
	
	
	
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Customer(String cid, String cname, long cmob, Address add) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmob = cmob;
		this.add = add;
	}
	public List<Item> getItem() {
		return Item;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cmob=" + cmob + ", Item=" + Item + ", add=" + add + "]";
	}
	public void setItem(List<Item> item) {
		Item = item;
	}
	public Customer(String cid, String cname, long cmob, List<Item> item) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmob = cmob;
		this.Item = item;
	}
	public Customer() {
		//super();
	}
	public Customer(String cid, String cname, long cmob) {
		//super();
		this.cid = cid;
		this.cname = cname;
		this.cmob = cmob;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCmob() {
		return cmob;
	}
	public void setCmob(long cmob) {
		this.cmob = cmob;
	}
	
	
	

}
