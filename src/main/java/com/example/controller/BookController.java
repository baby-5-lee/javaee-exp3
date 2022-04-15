package com.example.controller;

import com.example.domain.BookDetail;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping({"/getBooks/{keywords}","/getBooks"})
    public List<BookDetail> getBooks(@PathVariable(required = false) String keywords){
        return bookService.listBooks(keywords);
    }
    @PutMapping("/updateBook")
    public boolean updateBook(@RequestBody BookDetail book){
        return bookService.updateBook(book);
    }
    @PostMapping("/saveBook")
    public boolean saveBook(@RequestBody BookDetail book){
        return bookService.saveBook(book);
    }
    @DeleteMapping("/deleteBooks")
    public boolean deleteBook(@RequestBody Integer[] ids){
        return bookService.removeBooks(ids);
    }

}
