package com.guanyu.store.consume;

import com.guanyu.provider.book.domain.BookInfo;
import com.guanyu.provider.book.domain.BookInfoDTO;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author Guanyu
 */
@Component
public class BookChangedConsumer {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "comic"),
            exchange = @Exchange(name = "bookExchange"),
            key = {"comic", "audio"}
    ))
    public void listenBookChanged(BookInfo bookInfo, Message message, Channel channel) {
        try {
            System.out.println(new BookInfoDTO(bookInfo));
            long deliveryTag = message.getMessageProperties().getDeliveryTag();
            if ("择天记".equals(bookInfo.getTitle())) {
                throw new RuntimeException();
            }
            channel.basicAck(deliveryTag, false);

        } catch (Exception e) {
            e.printStackTrace();
            try {
                channel.basicRecover();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
