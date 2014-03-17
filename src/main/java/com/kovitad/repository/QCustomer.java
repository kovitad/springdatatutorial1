package com.kovitad.repository;

import com.kovitad.domain.Customer;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;

public class QCustomer extends EntityPathBase<Customer>{


	private static final long serialVersionUID = 6016509378194325332L;
	
	
	
	public QCustomer(Class<? extends Customer> type, PathMetadata<?> metadata) {
		
		
		super(type, metadata);
		
	}



}
