package org.janine.jian.repository;

import java.io.Serializable;

import org.janine.jian.BaseRepository;
import org.janine.jian.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseRepository<Customer, Serializable> {

	
	
}
