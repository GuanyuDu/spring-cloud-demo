package com.guanyu.book.service.impl;


import com.guanyu.book.domain.BookInfo;
import com.guanyu.book.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author Guanyu
 */
@Service
public class BookServiceImpl implements BookService {

    @Override
    public BookInfo getBookInfo(long cbId) {
        return new BookInfo(800143L, "择天记", "https://bookcover.yuewen.com/qdbimg/349573/3347595/150",
                "猫腻", "命里有时终须有，命里无时要强求。这是一个长生果的故事。");
    }
}
