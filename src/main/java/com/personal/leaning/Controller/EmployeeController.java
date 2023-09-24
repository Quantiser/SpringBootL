package com.personal.leaning.Controller;

import com.personal.leaning.model.Employee;
import com.personal.leaning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Qualifier("employeeServiceimple2")
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("addEmployee")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("getAllEmployee")
    public ArrayList<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("getEmployeeById/{id}")
    public Employee getEmplById(@PathVariable("id")String id){
        Employee employee=employeeService.getEmplById(id);
        if(employee==null)return new Employee();
        return employee;
    }

    @DeleteMapping("{id}")
    public String deleteEmpById(@PathVariable String id){
        return employeeService.deleteEmpById(id);
    }
}
