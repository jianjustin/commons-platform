package org.janine.jian.customer;

import java.sql.Date;

import org.janine.jian.model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.r2dbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CustomerRespositoryUnitTest {

	
	@Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    @Rollback(false)
    public void save() {
    	java.util.Date date = new java.util.Date();
	    Customer customer = new Customer();
	    customer.setLoginName("jian");
	    customer.setPassword("12345678");
	    customer.setUserStatus(1);
	    customer.setModifiedTime(new Date(date.getTime()));
	    Customer result = customerRepository.save(customer);
	    
    }

	public TestEntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(TestEntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
    
    
}
