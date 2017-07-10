package com.classmiss.ClassyMissyBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classmiss.ClassyMissyBackend.dao.CartDAO;
import com.classmiss.ClassyMissyBackend.model.Cart;

public class CartTestCase {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.classmiss.ClassyMissyBackend");
	context.refresh();
	
	CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
	
	Cart cart=new Cart();
	cart.setCardid(1001);
	cart.setProdid(4);
	cart.setProdname("Diamond Earring");
	cart.setPrice(10000);
	cart.setQuantity(3);
	cart.setStatus("N");
	cart.setUsername("Saranya");
	
	cartDAO.addToCart(cart);
	System.out.println("Added to Cart");
	
	/*List<Cart> list=cartDAO.getCartItems("Susi");
	for(Cart cart:list)
	{
		System.out.println(cart.getCardid()+":::");
		System.out.println(cart.getProdid()+":::");
		System.out.println(cart.getProdname()+":::");
		System.out.println(cart.getPrice()+":::");
		System.out.println(cart.getQuantity()+":::");
	}*/
	System.out.println("Cart Item Displayed");
}
}
