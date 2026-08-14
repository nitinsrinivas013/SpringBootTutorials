package com.redspade.RestEmployee.service;

import com.redspade.RestEmployee.dao.EmployeeRepository;
import com.redspade.RestEmployee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImplementation implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public ServiceImplementation(EmployeeRepository theEmployeeRepository){

        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if(result.isPresent()){
            theEmployee = result.get();
        }
        else{
            // we couldn't find the employee
            throw new RuntimeException("Employee Id not found - " + theId);
        }
        return theEmployee;
    }


    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }


    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }

}
