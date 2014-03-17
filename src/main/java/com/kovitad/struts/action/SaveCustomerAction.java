package com.kovitad.struts.action;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.kovitad.domain.Customer;
import com.kovitad.repository.MongoDBCustomerRepository;
import com.opensymphony.xwork2.ActionSupport;


@Component(value = "saveCustomerAction")
public class SaveCustomerAction  extends ActionSupport{
	
	private Customer customer = new Customer();
	
	
	//private static final Logger logger = LoggerFactory.getLogger(SaveCustomerAction.class);
	
	private static final long serialVersionUID = -6050470019544095910L;
	
	@Resource
	private MongoDBCustomerRepository mongoDBCustomerRepository;
	
	public String execute() throws Exception {
		
		Assert.notNull(customer);
		Assert.notNull(customer.getEmailAddress());
		Assert.notNull(customer.getFirstName());
		Assert.notNull(customer.getLastName());	
		mongoDBCustomerRepository.save(customer);
		
		return SUCCESS;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
