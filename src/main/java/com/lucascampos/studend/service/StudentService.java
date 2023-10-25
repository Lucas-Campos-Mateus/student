package com.lucascampos.studend.service;

import com.lucascampos.studend.model.Student;
import com.lucascampos.studend.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public List<Student> create(Student student){
        studentRepository.save(student);
        return list();
    }
    public List<Student> list(){
        Sort sort = Sort.by("Id").descending().and(Sort.by("firstName").ascending());
        return studentRepository.findAll(sort);
    }
    public List<Student> update(Student student){
        studentRepository.save(student);
        return list();
    }
    public List<Student> delete(Long id){
        studentRepository.deleteById(id);
        return list();
    }
}
