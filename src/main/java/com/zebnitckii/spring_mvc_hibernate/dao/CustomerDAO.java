package com.zebnitckii.spring_mvc_hibernate.dao;

import com.zebnitckii.spring_mvc_hibernate.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getAllCustomer();

    Customer getCustomer(int id);

    void saveCustomer(Customer customer);

    void deleteCustomer(int id);
}
