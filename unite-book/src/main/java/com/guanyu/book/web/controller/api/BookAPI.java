package com.guanyu.book.web.controller.api;

import com.guanyu.book.domain.BookInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Guanyu
 */
public interface BookAPI {

    /**
     * 打印 string 参数
     *
     * @param id 书籍 id
     * @return {@link BookInfo} 书籍信息对象
     */
    @GetMapping("/book/{id}")
    BookInfo getBookInfo(@PathVariable("id") long id);

}
