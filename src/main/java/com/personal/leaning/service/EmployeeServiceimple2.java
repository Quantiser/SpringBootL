package com.personal.leaning.service;

import com.personal.leaning.entity.EmployeeEntity;
import com.personal.leaning.model.Employee;
import com.personal.leaning.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceimple2 implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EntityMapper entityMapper;

    @Override
    public Employee save(Employee employee) {
        employeeRepository.save(entityMapper.getEntity(employee));

        return employee;
    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        List<EmployeeEntity> list= employeeRepository.findAll();

        ArrayList<Employee> employlist= new ArrayList<>();
        for(EmployeeEntity employee : list){
            employlist.add(entityMapper.getEmployee(employee));
        }
        System.out.println("Returning ALL EMployee");
        return employlist;
    }

    @Override
    public Employee getEmplById(String id) {
        Optional<EmployeeEntity> employee= employeeRepository.findById(id);
        System.out.println("Retruning Employee "+employee.get().getFirstName());

        return entityMapper.getEmployee(employee.get());
    }

    @Override
    public String deleteEmpById(String id) {
        return null;
    }
}
