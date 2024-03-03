package com.demo.onlinebookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

    public List<Book> findAllById(List<Integer> bookIds);
}
