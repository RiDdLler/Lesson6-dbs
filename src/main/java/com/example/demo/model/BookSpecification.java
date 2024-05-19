package com.example.demo.model;

import com.example.demo.entity.Book;
import com.example.demo.model.TestDTO;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class BookSpecification implements Specification<Book> {

    private TestDTO body;


    public BookSpecification(TestDTO body) {
        this.body = body;
    }

    @Override
    public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }
}