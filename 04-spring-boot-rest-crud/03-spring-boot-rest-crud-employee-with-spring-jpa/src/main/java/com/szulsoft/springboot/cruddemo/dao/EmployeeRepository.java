package com.szulsoft.springboot.cruddemo.dao;

import com.szulsoft.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need to write any code - CRUD for free
}
