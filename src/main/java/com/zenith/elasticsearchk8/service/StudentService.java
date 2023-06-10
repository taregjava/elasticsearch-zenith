package com.zenith.elasticsearchk8.service;

import com.zenith.elasticsearchk8.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    Page<Student> listStudentByPage(Pageable pageable);
    Student saveStudent(Student student);
    Page<Student> search(String text, Pageable pageable);
}
