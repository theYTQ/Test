package com.example.springbootdemo.module.article.model.view;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author ytq
 * @date 2023/2/16
 */
@Data
@Builder
public class ArticleView {
    private Long id;
    private String title;
    private Long authorId;
    private String author;
    private String content;
    private Integer likeCount;
    private Integer collectCount;
    private List<ArticleLabelView> labelViews;
    private Long createTime;
    private Long updateTime;
}
