package com.zebnitckii.spring_mvc_hibernate.service;

import com.zebnitckii.spring_mvc_hibernate.dao.EmployeeDAO;
import com.zebnitckii.spring_mvc_hibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployeesWithoutProject() {

     /*   List<Employee> employees = new ArrayList<>();

        for (Employee emp : employeeDAO.getAllEmployees()) {
            if (emp.getProjects().size() == 0) {
                employees.add(emp);
            }
        }*/

        return employeeDAO.getAllEmployeesWithoutProject();
    }
}
