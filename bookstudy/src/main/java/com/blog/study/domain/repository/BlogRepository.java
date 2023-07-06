package com.blog.study.domain.repository;

import com.blog.study.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
