package com.kovitad.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.data.mongodb.core.query.Query;

import com.kovitad.domain.Customer;

@Repository
public class MongoDBCustomerRepository implements CustomerRepository {

	private final MongoOperations operations;

	@Autowired
	public MongoDBCustomerRepository(final MongoOperations operations) {
		Assert.notNull(operations);
		this.operations = operations;
	}

	@Override
	public Customer save(Customer customer) {
		operations.save(customer);;
		return customer;
	}

	@Override
	public Customer findByEmailAddress(String emailAddress) {
		Query query = query(where("emailAddress").is(emailAddress));
		return operations.findOne(query, Customer.class);
	}

}
