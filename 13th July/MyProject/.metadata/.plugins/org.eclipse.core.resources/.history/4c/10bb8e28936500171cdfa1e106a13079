

package com.classmiss.ClassyMissyFrontend.controller;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.classmiss.ClassyMissyBackend.dao.ProductDAO;
import com.classmiss.ClassyMissyBackend.dao.UserDetailsDAO;
import com.classmiss.ClassyMissyBackend.model.Cart;
import com.classmiss.ClassyMissyBackend.model.Category;
import com.classmiss.ClassyMissyBackend.model.Product;
import com.classmiss.ClassyMissyBackend.model.Supplier;
import com.classmiss.ClassyMissyBackend.model.UserDetails;

@Controller
public class UserController {
	
	@Autowired
	UserDetailsDAO userDetailsDAO;
	
	@Autowired
	ProductDAO productDAO;
	
@RequestMapping("/login_success")
public String loginSuccess(HttpSession session,Model m)
{
	System.out.println("----Login Sucessful----");
	
	String page=null;
	boolean loggedIn=true;
	
	//Retrieving the username
	String username=SecurityContextHolder.getContext().getAuthentication().getName();
	session.setAttribute("username", username);
	session.setAttribute("loggedIn",loggedIn);
	
	//Retrieving the Role
	
	Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
	
	for(GrantedAuthority role:authorities)
	{
		System.out.println("Role:"+role.getAuthority()+"User Name:"+username);
		
		if(role.getAuthority().equals("Role_Admin"))
		{
			page="AdminHome";
		}
		else
		{
			List<Product> prodlist=productDAO.getProductDetails();
			m.addAttribute("prodlist",prodlist);
			page="UserHome";
		}
	}
	return page;
}
@RequestMapping(value="/InsertUserDetails",method=RequestMethod.POST)
public String insertUserDetails(@ModelAttribute("userDetails") UserDetails userDetails,Model m)
{
	System.out.println("---User Insert Processing---");
	userDetailsDAO.insertUpdateUserDetails(userDetails);
		
	
	List<UserDetails> userlist=userDetailsDAO.getUserDetails();
	m.addAttribute("userlist", userlist);
	System.out.println("---User Inserted---");
	return "Login";
}
@RequestMapping(value="/perform_logout",method=RequestMethod.GET)
public String logoutSuccess(HttpSession session)
{
	session.invalidate();
	System.out.println("Logout Successfully");
	return "index";
}


}


	


