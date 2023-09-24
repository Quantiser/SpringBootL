package com.personal.leaning.service;

import com.personal.leaning.ERROR.EmployeeNotFoundException;
import com.personal.leaning.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    ArrayList<Employee> employeeList= new ArrayList<Employee>();
    public Employee save(Employee employee){
        if(employee.getEmpId()==null ||
        employee.getEmailId().isEmpty()){
            employee.setEmpId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);

        return employee;
    }

    public ArrayList<Employee> getAllEmployees(){
        return employeeList;
    }

    @Override
    public Employee getEmplById(String id) {
//        for(int i=0;i<employeeList.size();i++) {
//            if (employeeList.get(i).getEmpId().equals(id)) return employeeList.get(i);
//        }
//        return employeeList
//                .stream()
//                .filter(employee -> employee.getEmpId().equals(id))
//                .findFirst()
//                .get();
        return employeeList
                .stream()
                .filter(employee -> employee.getEmpId().equals(id))
                .findFirst()
                .orElseThrow(()-> new EmployeeNotFoundException("Employee NOT FOUND "+id));
    }

    @Override
    public String deleteEmpById(String id) {
            Employee employee=employeeList
                .stream()
                .filter(employe -> employe.getEmpId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID: "+id+" not Found"));

            employeeList.remove(employee);
            return "Employee Deleted";

    }
}
