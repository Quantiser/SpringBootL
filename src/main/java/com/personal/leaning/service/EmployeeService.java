package com.personal.leaning.service;

import com.personal.leaning.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface EmployeeService {
    Employee save(Employee employee);
    ArrayList<Employee> getAllEmployees();

    Employee getEmplById(String id);

    String deleteEmpById(String id);
}
