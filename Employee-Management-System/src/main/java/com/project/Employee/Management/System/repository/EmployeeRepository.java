package com.project.Employee.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Employee.Management.System.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
