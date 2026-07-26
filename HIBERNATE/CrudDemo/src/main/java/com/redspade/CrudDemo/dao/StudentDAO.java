package com.redspade.CrudDemo.dao;

import com.redspade.CrudDemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findAllSortByLastName();

    List<Student> findByLastName(String myLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
