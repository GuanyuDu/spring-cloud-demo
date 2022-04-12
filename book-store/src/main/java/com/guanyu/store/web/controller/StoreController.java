package com.guanyu.store.web.controller;

import com.guanyu.provider.book.BookProvider;
import com.guanyu.provider.book.domain.BookInfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Guanyu
 */
@RestController
public class StoreController {

    @Resource
    private BookProvider bookProvider;

    @GetMapping(value = "/book/{id}")
    public BookInfoDTO getBook(@PathVariable long id) {
        return bookProvider.getBookInfo(id).orElse(new BookInfoDTO());
    }
}
