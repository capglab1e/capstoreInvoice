package com.cg.capstore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dto.Order;
import com.cg.capstore.dto.Product;
@Repository
@Transactional
public class CapstoreDAOImpl implements ICapstoreDAO {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Product getDetails(String Id) {
		Order order = manager.find(Order.class, Id);
		
		return manager.find(Product.class, order.getProduct_Id());
	}


}


