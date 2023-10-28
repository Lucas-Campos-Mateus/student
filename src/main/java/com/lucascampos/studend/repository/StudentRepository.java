package com.lucascampos.studend.repository;

import com.lucascampos.studend.model.Student;
import com.lucascampos.studend.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
