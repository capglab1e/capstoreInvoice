package com.cg.capstore.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore.dao.ICapstoreDAO;
import com.cg.capstore.dto.Product;
@Service
@Transactional
public class CapstoreServiceImpl implements ICapstoreService {

	@Autowired
	ICapstoreDAO dao;
	
	@Override
	public Product getAllDetails(String Id) {
		
		return dao.getDetails(Id);
	}

	
	

}
