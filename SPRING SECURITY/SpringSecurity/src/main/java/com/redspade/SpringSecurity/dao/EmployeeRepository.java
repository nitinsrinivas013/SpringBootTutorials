package com.redspade.SpringSecurity.dao;

import com.redspade.SpringSecurity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}