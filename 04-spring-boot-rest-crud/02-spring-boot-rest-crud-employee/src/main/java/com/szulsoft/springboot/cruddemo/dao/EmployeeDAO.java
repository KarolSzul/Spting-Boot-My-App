package com.szulsoft.springboot.cruddemo.dao;

import com.szulsoft.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
