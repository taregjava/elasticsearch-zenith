package com.zenith.elasticsearchk8.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "student", createIndex = false)
public class Student {

    @Id
    private String id;
    private String name;
}
