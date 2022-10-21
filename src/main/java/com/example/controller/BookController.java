package com.example.controller;

import com.example.domain.BookDetail;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@CrossOrigin
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping({"/getBooks/{keywords}/{currentPage}/{pageSize}","/getBooks/{currentPage}/{pageSize}"})
    public Map<String, Object> getBooks(@PathVariable(required = false) String keywords, @PathVariable Integer currentPage, @PathVariable Integer pageSize){
        return bookService.listBooks(keywords,currentPage,pageSize);
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
