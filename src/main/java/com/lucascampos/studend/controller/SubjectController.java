package com.lucascampos.studend.controller;

import com.lucascampos.studend.model.Student;
import com.lucascampos.studend.model.Subject;
import com.lucascampos.studend.service.StudentService;
import com.lucascampos.studend.service.SubjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping
    List<Subject> create(@RequestBody @Valid Subject subject){
        return subjectService.create(subject);
    }
    @GetMapping
    List<Subject> list(){
        return subjectService.list();
    }
    @PutMapping
    List<Subject> update(@RequestBody Subject subject){
        return subjectService.update(subject);
    }
    @DeleteMapping("{id}")
    List<Subject> delete(@PathVariable("id") Long id){
        return subjectService.delete(id);
    }
}
