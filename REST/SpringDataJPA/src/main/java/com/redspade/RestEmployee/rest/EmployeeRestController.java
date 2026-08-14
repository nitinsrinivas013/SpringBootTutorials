package com.redspade.RestEmployee.rest;


import com.redspade.RestEmployee.entity.Employee;
import com.redspade.RestEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;
    private final JsonMapper jsonmapper;

    @Autowired
    public EmployeeRestController(EmployeeService em, JsonMapper theJsonmapper){
        jsonmapper = theJsonmapper;
        employeeService = em;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId){

        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null){
            throw new RuntimeException("Employee Id not found - " + employeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){

        theEmployee.setId(0);

        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){

        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;

    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){

        Employee tempEmployee = employeeService.findById(employeeId);

        if(tempEmployee == null){
            throw new RuntimeException("Employee ID not found - " + employeeId);
        }
        employeeService.deleteById(employeeId);

        return "Deleted employee Id - " + employeeId;
    }

    @PatchMapping("/employees/{employeeId}")
    public Employee patchEmployee(
            @PathVariable int employeeId,
            @RequestBody Map<String, Object> updatedData)
    {

        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null){
            throw new RuntimeException("Employee Id not found " + employeeId);
        }
        // If request body contains the id:
        if(updatedData.containsKey("id")){
            throw new RuntimeException("You cannot change the id, its a primary key");
        }

        Employee updatedEmployee = jsonmapper.updateValue(theEmployee, updatedData);
        Employee dbEmployee = employeeService.save(updatedEmployee);

        return dbEmployee;
    }
}
