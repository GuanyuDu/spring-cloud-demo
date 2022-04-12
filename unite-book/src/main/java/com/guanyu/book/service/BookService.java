package com.guanyu.book.service;

import com.guanyu.book.domain.BookInfo;

/**
 * @author Guanyu
 */
public interface BookService {

    /**
     * 获取书籍信息
     *
     * @param cbId 书籍 id
     * @return {@link BookInfo} 书籍信息详情
     */
    BookInfo getBookInfo(long cbId);
}
