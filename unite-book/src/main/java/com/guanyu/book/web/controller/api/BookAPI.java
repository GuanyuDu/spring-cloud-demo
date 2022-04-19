package com.guanyu.book.web.controller.api;

import com.guanyu.book.domain.BookInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    /**
     * 触发书籍变更消息
     *
     * @param name 消息内容
     * @return {@link String} 消息发送状态
     */
    @PostMapping("/book")
    String sendBook(@RequestParam("name") String name);

    /**
     * 触发漫画变更消息
     *
     * @param name 漫画名称
     * @return {@link String} 消息发送状态
     */
    @PostMapping("/comic")
    String sendComic(@RequestParam("name") String name);

}
