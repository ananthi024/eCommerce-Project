package com.classmiss.ClassyMissyFrontend.controller;

import java.util.LinkedHashMap;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.classmiss.ClassyMissyBackend.dao.SupplierDAO;


import com.classmiss.ClassyMissyBackend.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDAO supplierDAO;
	
	
	@RequestMapping("/Supplier")
	public String showProduct(Model m)
	{
		
		Supplier supplier=new Supplier();
		
		
		m.addAttribute("suplist", this.getSupList());
		m.addAttribute("Supplier", supplier);
		
		
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist", suplist);
		return "Supplier";
	}
	
	@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
	public String insertSupplier(@ModelAttribute("supplier") Supplier supplier,Model m)
	{
		System.out.println("---Supplier Inserted---");
		supplierDAO.insertUpdateSupplier(supplier);
			
		
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist", suplist);
		return "Supplier";
	}
	
	@RequestMapping(value="/updateSupplier/{supid}")
	public String updateSupplier(@PathVariable("supid")int supid,Model m)
	{
		Supplier supplier=supplierDAO.getSupplier(supid);
		
		m.addAttribute("Supplier", supplier);
		m.addAttribute("suplist", this.getSupList());
		
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist", suplist);
		return "Supplier";
	}
	
	@RequestMapping(value="/deleteSupplier/{supid}")
	public String deleteSupplier(@PathVariable("supid")int supid,Model m)
	{
		
		Supplier supplier=supplierDAO.getSupplier(supid);
		supplierDAO.deleteSupplier(supplier);
		
		
		Supplier supplier2=new Supplier();
		m.addAttribute("Supplier", supplier2);
		m.addAttribute("suplist", this.getSupList());
		
		List<Supplier> suplist=supplierDAO.getSupplierDetails();
		m.addAttribute("suplist", suplist);
		return "Supplier";
	}
	
	public LinkedHashMap<Integer,String> getSupList()
	{
		List<Supplier> list=supplierDAO.getSupplierDetails();
		
		LinkedHashMap<Integer,String> suplist=new LinkedHashMap<Integer,String>();
		
		for(Supplier sup:list)
		{
			suplist.put(sup.getSupid(),sup.getSupname());
		}
		
		return suplist;
	}
	
	
	
	
}


	
	
	
	
	
	
	