package com.test.dao;
import java.util.*;
import com.test.model.*;
public interface CustomerDao {
	public List<Customer> listAllCustomers();

	public int saveCustomer(Customer obj);


}
