package com.guanyu.book.publish;

import com.guanyu.book.domain.BookInfo;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

/**
 * @author Guanyu
 */
@Component
public class BookChangedPublisher {

    @Value("${book.queue.exchange:bookExchange}")
    private String exchange;

    @Value("${book.queue.routing-key:book}")
    private String bookRoutingKey;

    @Value("${comic.queue.routing-key:comic}")
    private String comicRoutingKey;

    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送文本消息到书变更队列
     *
     * @param message 文本消息
     * @return {@link boolean} 发送状态，成功-true，失败-false
     */
    public boolean sendToBook(String message) {
        try {
            MessageProperties properties = new MessageProperties();
            properties.setMessageId("1");
            Message messageObj = new Message(message.getBytes(StandardCharsets.UTF_8), properties);
            rabbitTemplate.convertAndSend(exchange, bookRoutingKey, messageObj);
            return true;

        } catch (AmqpException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 发送漫画实体到
     *
     * @param bookInfo 文本消息
     * @return {@link boolean} 发送状态，成功-true，失败-false
     */
    public boolean sendToComic(BookInfo bookInfo) {
        try {
            rabbitTemplate.convertAndSend(exchange, comicRoutingKey, bookInfo);
            return true;

        } catch (AmqpException e) {
            e.printStackTrace();
        }
        return false;
    }
}
