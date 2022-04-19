package com.guanyu.store.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * RabbitMQ 发送失败回调配置
 * @author Guanyu
 */
@Slf4j
@Configuration
public class RabbitMQCallbackConfiguration {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void enableConfirmCallback() {
        // 监听交换机是否成功接收到消息，失败 ack 为 false
        rabbitTemplate.setConfirmCallback(((correlationData, ack, cause) -> {
            if (!ack) {
                // 记录失败日志、发送通知、进行补偿措施
                log.error("Failed to send message to exchange. correlationData = {}, cause = {}",
                        correlationData, cause);
            }
        }));
        // 监听交换机是否成功将消息推送到队列
        rabbitTemplate.setReturnsCallback(returned -> {
            // 记录失败日志、发送通知、进行补偿措施
            log.error("Failed to send message from exchange to queue. returned = {}", returned);
        });
    }
}
