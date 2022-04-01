package org.hero.miniblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author henry
 * @description 博客
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String authorId;
    private String authorName;
    private String article;
    private LocalDate createTime;
    private LocalDate updateTime;
    private LocalDate deleteTime;

    public Blog(String id, String title, String authorId, String authorName, String article) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.authorName = authorName;
        this.article = article;
    }

    public Blog(String title, String authorId, String authorName, String article) {
        this.title = title;
        this.authorId = authorId;
        this.authorName = authorName;
        this.article = article;
    }
}
