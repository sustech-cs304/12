package com.example.mvcdemo2.repository;

import com.example.mvcdemo2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {
    //List<Student> findByEmailLike(String email);
}