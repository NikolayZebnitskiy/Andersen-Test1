package com.zebnitckii.spring_mvc_hibernate.service;

import com.zebnitckii.spring_mvc_hibernate.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();

    Customer getCustomer(int id);

    void saveCustomer(Customer customer);

    void deleteCustomer(int id);
}
