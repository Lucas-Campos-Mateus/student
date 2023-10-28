package com.lucascampos.studend.service;

import com.lucascampos.studend.model.Student;
import com.lucascampos.studend.model.Subject;
import com.lucascampos.studend.repository.StudentRepository;
import com.lucascampos.studend.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;
    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> create(Subject subject){
        subjectRepository.save(subject);
        return list();
    }
    public List<Subject> list(){
        Sort sort = Sort.by("Id").descending().and(Sort.by("name").ascending());
        return subjectRepository.findAll(sort);
    }
    public List<Subject> update(Subject subject){
        subjectRepository.save(subject);
        return list();
    }
    public List<Subject> delete(Long id){
        subjectRepository.deleteById(id);
        return list();
    }
}
