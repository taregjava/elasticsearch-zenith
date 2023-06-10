package com.zenith.elasticsearchk8.controller;

import com.zenith.elasticsearchk8.model.Student;
import com.zenith.elasticsearchk8.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    @Operation(summary = "Get Student")
    @GetMapping
    public Page<Student> getStudents(@ParameterObject Pageable pageable) {
        return studentService.listStudentByPage(pageable);
    }

    @Operation(summary = "Create Student")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Student createStudent(@Valid @RequestBody Student createStudent) {

        return studentService.saveStudent(createStudent);
    }
    @Operation(
            summary = "Search for Student",
            description = "This endpoint queries for a 'text' informed in the following fields: , 'name'")
    @PutMapping("/search")
    public Page<Student> searchProducts(@Valid @RequestBody String name, @ParameterObject Pageable pageable) {
        return studentService.search(name, pageable);
    }

}
