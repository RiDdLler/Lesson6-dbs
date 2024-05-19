package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "book", schema = "public")
public class Book {
    //  id, title, author, publication_year, quantity
    @Id
    private int id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private Integer publicationYear;
    @Column(name = "quantity")
    private Integer quantity;
}