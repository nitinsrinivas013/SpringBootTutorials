package com.redspade.CrudDemo.dao;

import com.redspade.CrudDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class StudentDAOImpl implements StudentDAO {

    private final EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public void save(Student theStudent){
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id){
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        TypedQuery<Student> query1 = entityManager.createQuery(
                "FROM Student",
                Student.class
        );

        return query1.getResultList();
    }

    @Override
    public List<Student> findAllSortByLastName() {

        // ORDER BY SORTS DEFAULTLY IN ASCENDING ORDER:

        // TO SORT IT IN DESCENDING ORDER:

        // FROM Student ORDER BY lastName desc

        TypedQuery<Student> query2 = entityManager.createQuery(
                "FROM Student ORDER BY lastName",
                Student.class
        );
        return query2.getResultList();
    }

    @Override
    public List<Student> findByLastName(String myLastName) {

        TypedQuery<Student> query3 = entityManager.createQuery(
                "FROM Student WHERE lastName = :theData",
                Student.class
        );
        query3.setParameter("theData", myLastName);
        return query3.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {

        Student byeStudent = entityManager.find(Student.class, id);
        entityManager.remove(byeStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {

        int numRowsDeleted = entityManager
                .createQuery("DELETE FROM Student ")
                .executeUpdate();

        return numRowsDeleted;
    }
}
