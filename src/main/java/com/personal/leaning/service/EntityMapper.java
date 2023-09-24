package com.personal.leaning.service;

import com.personal.leaning.entity.EmployeeEntity;
import com.personal.leaning.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntityMapper {

    public EmployeeEntity getEntity(Employee employee){
        EmployeeEntity  employeeEntity = new EmployeeEntity();

        employeeEntity.setEmailId(employee.getEmailId());
        employeeEntity.setEmpId(employee.getEmpId());
        employeeEntity.setFirstName(employee.getFirstName());
        employeeEntity.setLastName(employee.getLastName());
        employeeEntity.setDepartment(employee.getDepartment());
        return employeeEntity;
    }

    public  Employee getEmployee(EmployeeEntity entity){
        Employee employee = new Employee();
        employee.setDepartment(entity.getDepartment());
        employee.setLastName(entity.getLastName());
        employee.setEmpId(entity.getEmpId());
        employee.setFirstName(entity.getFirstName());
        employee.setEmailId(entity.getEmailId());
        return employee;
    }

}