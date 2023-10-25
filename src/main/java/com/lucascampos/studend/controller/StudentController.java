package com.lucascampos.studend.controller;

import com.lucascampos.studend.model.Student;
import com.lucascampos.studend.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @PostMapping
    List<Student> create(@RequestBody @Valid Student student){
        return studentService.create(student);
    }
    @GetMapping
    List<Student> list(){
        return studentService.list();
    }
    @PutMapping
    List<Student> update(@RequestBody Student student){
        return studentService.update(student);
    }
    @DeleteMapping("{id}")
    List<Student> delete(@PathVariable("id") Long id){
        return studentService.delete(id);
    }

}
