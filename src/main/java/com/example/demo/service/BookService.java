package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.model.TestDTO;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final DatabaseService databaseService;

    public Page<Book> getAllBooks(TestDTO dto) {
        return databaseService.getAllBooks();
    }

    public void deleteBook(Integer id) throws Exception{
        databaseService.deleteBook(id);
    }
}