package com.blog.study.domain.dto;

import com.blog.study.domain.entity.Article;
import lombok.Getter;

@Getter
public class ArticleResponseDto {

    private final String title;
    private final String content;

    public ArticleResponseDto(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
