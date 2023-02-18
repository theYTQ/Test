package com.example.springbootdemo.module.article.model.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ytq
 */
@Data
@Builder
public class ArticleComment {
    private Long id;
    private Long userId;
    private String comment;
    private Long createTime;
    private Long updateTime;
    private Integer deleted;
}
