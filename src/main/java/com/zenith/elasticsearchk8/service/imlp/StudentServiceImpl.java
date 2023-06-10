package com.zenith.elasticsearchk8.service.imlp;

import com.zenith.elasticsearchk8.model.Student;
import com.zenith.elasticsearchk8.repo.StudentRepository;
import com.zenith.elasticsearchk8.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public Page<Student> listStudentByPage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Page<Student> search(String text, Pageable pageable) {
        return repository.findByName(text,pageable);
    }
}
