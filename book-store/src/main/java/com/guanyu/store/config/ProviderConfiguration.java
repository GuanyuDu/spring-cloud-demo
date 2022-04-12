package com.guanyu.store.config;

import com.guanyu.provider.book.BookProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * provider 包扫描路径
 *
 * @author Guanyu
 */
@Configuration
@Import({
        BookProvider.class
})
public class ProviderConfiguration {}
