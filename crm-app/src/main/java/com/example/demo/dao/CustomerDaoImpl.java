package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Customer;
@Repository
@EnableTransactionManagement
public class CustomerDaoImpl implements CustomerDao{

	private EntityManager entityManager;
	
	@Autowired
	public CustomerDaoImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}


	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		
		Query query=entityManager.createQuery("FROM Customer",Customer.class);
		return query.getResultList();
	}

}
