package com.niit.dt.services;
import java.util.List;

import com.niit.dt.model.Customer;

public interface CustomerService {
void saveCustomer(Customer customer);
List<Customer> getCustomers();
}
