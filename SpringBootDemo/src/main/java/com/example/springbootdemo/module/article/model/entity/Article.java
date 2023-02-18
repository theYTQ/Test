package com.example.springbootdemo.module.article.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author ytq
 */
@Data
@Builder
public class Article {
    private Long id;
    private String title;
    private String author;
    private String content;
    private Integer likeCount;
    private Integer collectCount;
    private List<Long> labelIds;
    private Long createTime;
    private Long updateTime;
    private Integer deleted;
}
