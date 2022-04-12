package com.guanyu.provider.book.domain;

/**
 * @author Guanyu
 */
public class BookInfo {

    private Long cbId;
    private String title;
    private String cover;
    private String author;
    private String description;

    public BookInfo() {
    }

    public BookInfo(Long cbId, String title, String cover, String author, String description) {
        this.cbId = cbId;
        this.title = title;
        this.cover = cover;
        this.author = author;
        this.description = description;
    }

    public Long getCbId() {
        return cbId;
    }

    public void setCbId(Long cbId) {
        this.cbId = cbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
