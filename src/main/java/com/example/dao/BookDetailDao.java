package com.example.dao;

import com.example.domain.BookDetail;

import java.util.List;

/**
* @author Climber
* @description 针对表【book_detail】的数据库操作Mapper
* @createDate 2022-04-06 02:54:47
* @Entity com.example.domain.BookDetail
*/
public interface BookDetailDao {

    Integer insertBook(BookDetail book);

    List<BookDetail> listBooks(String keywords);

    Integer updateBook(BookDetail book);

    Integer deleteBooks(Integer[] ids);

    Integer countBooks(String keywords);
}




