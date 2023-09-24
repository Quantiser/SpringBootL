package com.personal.leaning.repository;

import com.personal.leaning.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String>{
}
