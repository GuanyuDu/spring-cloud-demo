package com.guanyu.book.web.controller;

import com.guanyu.book.constant.BookTypeEnum;
import com.guanyu.book.domain.BookInfo;
import com.guanyu.book.publish.BookChangedPublisher;
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

    @Resource
    private BookChangedPublisher publisher;

    @Override
    public BookInfo getBookInfo(@PathVariable long id) {
        return bookService.getBookInfo(id);
    }

    @Override
    public String sendBook(String name) {
        if (publisher.sendToBook(name)) {
            return "Send success.";
        }
        return "Send failed.";
    }

    @Override
    public String sendComic(String name) {
        BookInfo bookInfo = new BookInfo(1L, name, "cover", "author", BookTypeEnum.COMIC, "Good");
        if (publisher.sendToComic(bookInfo)) {
            return "Send success.";
        }
        return "Send failed.";
    }
}
