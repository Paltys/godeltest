package com.godelTest.controllers;


import com.godelTest.entity.Employee;
import com.godelTest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("employee")
public class Controller {
    private final EmployeeService employeeService;

    @Autowired
    public Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.getAll();

    }

    @GetMapping("{id}")
    public Employee getOne(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("{id}")
    public int delete(@PathVariable int id){
        employeeService.delEmployee(id);
        return id;
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return employee;
    }

    @PutMapping("{id}")
    public Employee update (@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployee(id, employee);
        return employee;
    }

}
