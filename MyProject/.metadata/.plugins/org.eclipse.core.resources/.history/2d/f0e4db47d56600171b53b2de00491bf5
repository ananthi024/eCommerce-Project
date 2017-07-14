package com.classmiss.ClassyMissyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classmiss.ClassyMissyBackend.dao.UserDetailsDAO;
import com.classmiss.ClassyMissyBackend.model.UserDetails;

public class UserDetailsTestCase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.classmiss.ClassyMissyBackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		UserDetailsDAO userDetailsDAO=(UserDetailsDAO)context.getBean("userDetailsDAO");
		
		//Insertion TestCase
		
		UserDetails userDetails=new UserDetails();
		userDetails.setUsername("Abi");
		userDetails.setCusname("Abinaya");
		
		userDetails.setPassword("12345");
		
		userDetails.setAddress("Chennai");
		userDetails.setEmail("abi@gmail.com");
		userDetails.setMobileno("9786503526");
	
		userDetailsDAO.insertUpdateUserDetails(userDetails);		
		
		System.out.println("UserDetails Inserted");
		

	
	        //Deletion TestCase
			/*UserDetails userDetails=new UserDetails();
			userDetailsDAO.deleteUserDetails(userDetails);
			System.out.println("The UserDetails Deleted");*/
					
			
			//Update the UserDetails
			
			/*UserDetails userDetails=new UserDetails();
			userDetails.setUemail("abi123@gmail.com");
			userDetailsDAO.insertUpdateUserDetails(userDetails);;
			System.out.println("The User Details Updated");*/
		
		
		/*List<User> list=productDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.println(product.getProdid()+":"+product.getProdname()+":"+product.getProddesc()+":"+product.getCatid()+":"+product.getSupid()+":"+product.getPrice()+":"+product.getQuantity());
		}*/
}
}


