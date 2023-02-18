package com.example.springbootdemo.module.article.model.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ytq
 */
@Data
@Builder
public class ArticleLabel {
    private Long id;
    private String name;
    private Long createTime;
    private Long updateTime;
    private Integer deleted;
}
