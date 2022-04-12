package com.guanyu.provider.book;

import com.guanyu.provider.book.core.BookClient;
import com.guanyu.provider.book.domain.BookInfo;
import com.guanyu.provider.book.domain.BookInfoDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author Guanyu
 */
@Component
public class BookProvider {

    @Resource
    private BookClient bookClient;

    public Optional<BookInfoDTO> getBookInfo(long cbId) {
        BookInfo bookInfo = bookClient.getBookInfo(cbId);
        if (bookInfo == null) {
            return Optional.empty();
        }
        return Optional.of(new BookInfoDTO(bookInfo));
    }
}
