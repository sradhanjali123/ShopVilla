package com.niit.dt.dao;
import java.util.List;

import com.niit.dt.model.Customer;

public interface CustomerDao {
void saveCustomer(Customer customer);
List<Customer> getCustomers();//duplicate username and email
}
