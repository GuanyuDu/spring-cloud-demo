package com.guanyu.book.task;

import com.google.common.base.Supplier;
import com.guanyu.book.publish.BookChangedPublisher;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Guanyu
 */
@Component
public class TaskRunner implements InitializingBean, SmartInitializingSingleton {

    @Resource
    private BookChangedPublisher publisher;

    @PostConstruct
    private void init() throws InterruptedException {

//        Runnable sender = () -> publisher.sendToBook("Test message, current time is " +
//                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
//
//        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
//        executor.scheduleAtFixedRate(sender, 0, 1000, TimeUnit.MILLISECONDS);

    }

    @Override
    public void afterPropertiesSet() throws Exception {}

    @Override
    public void afterSingletonsInstantiated() {}
}
