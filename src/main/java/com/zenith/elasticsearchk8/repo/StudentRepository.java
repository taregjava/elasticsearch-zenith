package com.zenith.elasticsearchk8.repo;

import com.zenith.elasticsearchk8.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends ElasticsearchRepository<Student,String> {
    Page<Student> findByName(String name, Pageable pageable);
}
