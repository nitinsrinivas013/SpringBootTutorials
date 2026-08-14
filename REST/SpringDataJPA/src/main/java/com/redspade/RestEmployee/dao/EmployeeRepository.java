package com.redspade.RestEmployee.dao;

import com.redspade.RestEmployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
