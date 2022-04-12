package com.guanyu.provider.book.core;

import com.guanyu.provider.book.api.BookAPI;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Guanyu
 */
@FeignClient(value = "unite-book-service")
public interface BookClient extends BookAPI {

}
