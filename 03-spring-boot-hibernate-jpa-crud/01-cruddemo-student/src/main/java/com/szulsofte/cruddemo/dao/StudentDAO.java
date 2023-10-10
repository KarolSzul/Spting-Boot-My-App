package com.szulsofte.cruddemo.dao;

import com.szulsofte.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);


    Student findById(Integer id);


}
