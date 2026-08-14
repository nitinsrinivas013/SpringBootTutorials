package com.redspade.SpringDocOpenApiSwagger.service;


import com.redspade.SpringDocOpenApiSwagger.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
