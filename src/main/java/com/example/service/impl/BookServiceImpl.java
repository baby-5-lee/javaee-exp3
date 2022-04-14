package com.example.service.impl;

import com.example.domain.BookDetail;
import com.example.dao.BookDetailDao;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDetailDao bookDetailDao;

    @Override
    public boolean saveBook(BookDetail book) {
        return bookDetailDao.insertBook(book) == 1;
    }

    @Override
    public boolean removeBooks(Integer[] ids) {
        return bookDetailDao.deleteBooks(ids) == ids.length;
    }

    @Override
    public List<BookDetail> listBooks(String keywords) {
        return bookDetailDao.listBooks(keywords);
    }

    @Override
    public boolean updateBook(BookDetail book) {
        return bookDetailDao.updateBook(book) == 1;
    }
}
