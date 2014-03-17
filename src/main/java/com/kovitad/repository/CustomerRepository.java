package com.kovitad.repository;

import org.springframework.data.repository.Repository;
import com.kovitad.domain.Customer;


public interface CustomerRepository extends Repository<Customer, Long>{

	Customer save(Customer customer);

	Customer findByEmailAddress(String emailAddress);
}
