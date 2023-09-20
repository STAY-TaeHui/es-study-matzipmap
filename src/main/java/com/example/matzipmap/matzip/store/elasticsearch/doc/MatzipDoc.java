package com.example.matzipmap.matzip.store.elasticsearch.doc;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "matzip")
public class MatzipDoc
{
    @Id
    private Long id;

    private String title;

    private String address;

    private String call;

    @ElementCollection
    private List<Menu> menu;

    private String introduce;
}
