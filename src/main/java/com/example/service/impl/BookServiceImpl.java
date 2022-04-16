package com.example.service.impl;

import com.example.domain.BookDetail;
import com.example.dao.BookDetailDao;
import com.example.service.BookService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public Map<String, Object> listBooks(String keywords, Integer page, Integer pageSize) {
        Map<String,Object> map = new HashMap<>(2);
        int total = bookDetailDao.countBooks(keywords);
        map.put("total",total);
        if (total == 0) {
            map.put("books", new ArrayList<BookDetail>());
            return map;
        }
        if (pageSize > total){
            page = 1;
            pageSize = total;
        }
        PageHelper.startPage(page,pageSize);
        map.put("books",bookDetailDao.listBooks(keywords));
        return map;
    }

    @Override
    public boolean updateBook(BookDetail book) {
        return bookDetailDao.updateBook(book) == 1;
    }
}
