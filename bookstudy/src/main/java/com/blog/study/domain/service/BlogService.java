package com.blog.study.domain.service;

import com.blog.study.domain.dto.AddArticleRequestDto;
import com.blog.study.domain.entity.Article;
import com.blog.study.domain.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor   // final 이 붙거나 @NotNull 이 붙은 필드의 생성자 추가
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequestDto request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
