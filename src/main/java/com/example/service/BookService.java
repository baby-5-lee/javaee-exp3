package com.example.service;

import com.example.domain.BookDetail;

import java.util.List;

public interface BookService {

    List<BookDetail> listBooks(String keywords);

    boolean updateBook(BookDetail book);

    boolean saveBook(BookDetail book);

    boolean removeBooks(Integer[] ids);
}
