package com.guanyu.provider.book.domain;

/**
 * @author Guanyu
 */
public class BookInfoDTO {

    private Long cbId;
    private String title;
    private String cover;
    private String author;
    private String description;

    public BookInfoDTO() {
    }

    public BookInfoDTO(BookInfo bookInfo) {
        this.cbId = bookInfo.getCbId();
        this.title = bookInfo.getTitle();
        this.cover = bookInfo.getCover();
        this.author = bookInfo.getAuthor();
        this.description = bookInfo.getDescription();
    }

    public Long getCbId() {
        return cbId;
    }

    public String getTitle() {
        return title;
    }

    public String getCover() {
        return cover;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "BookInfoDTO{" +
                "cbId=" + cbId +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
