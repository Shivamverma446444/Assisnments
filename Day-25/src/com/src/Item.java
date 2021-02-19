package com.src;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Item  {
	
	
	private int ItemId;
	private String ItemName;
	private double ItemPrice;
	
	
	
	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", ItemName=" + ItemName + ", ItemPrice=" + ItemPrice + "]";
	}
	public Item(int itemId, String itemName, double itemPrice) {
		//super();
		ItemId = itemId;
		ItemName = itemName;
		ItemPrice = itemPrice;
	}
	public Item() {
		//super();
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}
	
	
	

}
