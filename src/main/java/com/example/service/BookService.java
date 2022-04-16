package com.example.service;

import com.example.domain.BookDetail;

import java.util.List;
import java.util.Map;

public interface BookService {

    Map<String, Object> listBooks(String keywords, Integer page, Integer size);

    boolean updateBook(BookDetail book);

    boolean saveBook(BookDetail book);

    boolean removeBooks(Integer[] ids);
}
