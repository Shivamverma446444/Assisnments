package com.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;



public class ApplicationConfig {
	
@Bean(name="cset")
	public Customer getCustomer()
{
	Customer c=new Customer();
	c.setCid("c1");
	c.setCname("bhagya");
	c.setCmob(987654322);
	return c;
	}
@Bean(name="csetobj")
public Customer getCustomer1()
{
	Customer c=new Customer();
	c.setCid("c2");
	c.setCname("jaya");
	c.setCmob(9874322);
	Address ad=new Address();
	ad.setHno(1);
	ad.setCity("sklm");
	c.setAdd(ad);
	return c;
	}
@Bean(name="setlist")
public Customer getCustomer2()
{
	Customer c=new Customer();
	c.setCid("c1");
	c.setCname("bhagya");
	c.setCmob(987654322);
	List<Item> i1=new LinkedList();
	Item a1=new Item();
	a1.setItemId(1);
	a1.setItemName("fan");
	a1.setItemPrice(200);
	i1.add(a1);
	
	Item a2=new Item();
	a2.setItemId(1);
	a2.setItemName("fan");
	a2.setItemPrice(200);
	i1.add(a2);
	c.setItem(i1);
	return c;



}
@Bean(name="conslist")
public Customer getCustomer5()
{
	Customer c=new Customer();
	c.setCid("c91");
	c.setCname("suresh");
	c.setCmob(788765432);
	List<Item> a=new LinkedList();
	a.add(new Item(1,"mixy",50000));
	a.add(new Item(2,"Grinder",20000));
	c.setItem(a);
	return c;
	
}
@Bean(name="cons")
public Customer getCustomer3()
{
	return new Customer("c100","shiva",98765);	
}
@Bean(name="consobj")
public Customer getCustomer4()
{
	return new Customer("c200","hiva",8765,new Address(193,"vskp"));	
}












}

