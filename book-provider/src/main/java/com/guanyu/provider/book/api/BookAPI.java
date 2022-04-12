package com.guanyu.provider.book.api;

import com.guanyu.provider.book.domain.BookInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Guanyu
 */
public interface BookAPI {

    /**
     * 获取书籍信息
     *
     * @param id 书籍 id
     * @return {@link BookInfo} 书籍信息对象
     */
    @GetMapping("/book/{id}")
    BookInfo getBookInfo(@PathVariable("id") long id);

}
