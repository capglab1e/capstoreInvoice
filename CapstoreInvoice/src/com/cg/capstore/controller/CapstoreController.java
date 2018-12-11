package com.cg.capstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.dto.Product;
import com.cg.capstore.service.ICapstoreService;




@Controller
public class CapstoreController {
	
	
	@Autowired
	ICapstoreService service;
	
	@RequestMapping("home")
	public ModelAndView showList(){
		
		return new ModelAndView("homePage") ;
	}
	
	@RequestMapping("generate")
	public ModelAndView invoice(@RequestParam("orderId") String id){
		Product product = service.getAllDetails(id);
		return new ModelAndView("invoice","prod",product);
		
	}
}
