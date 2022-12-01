package com.zebnitckii.spring_mvc_hibernate.service;

import com.zebnitckii.spring_mvc_hibernate.dao.CustomerDAO;
import com.zebnitckii.spring_mvc_hibernate.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }

    @Override
    @Transactional
    public Customer getCustomer(int id) {
        return customerDAO.getCustomer(id);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(int id) {
     customerDAO.deleteCustomer(id);
    }
}
