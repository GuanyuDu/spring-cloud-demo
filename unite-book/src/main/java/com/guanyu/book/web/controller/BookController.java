package com.guanyu.book.web.controller;

import com.guanyu.book.domain.BookInfo;
import com.guanyu.book.service.BookService;
import com.guanyu.book.web.controller.api.BookAPI;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Guanyu
 */
@RestController
public class BookController implements BookAPI {

    @Resource
    private BookService bookService;

    @Override
    public BookInfo getBookInfo(@PathVariable long id) {
        return bookService.getBookInfo(id);
    }
}
