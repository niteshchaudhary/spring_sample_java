package com.homeaway.repository;


import com.homeaway.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findAll(){


        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Test");
        customer.setLastName("User");

        customers.add(customer);

        return customers;

    }


}
