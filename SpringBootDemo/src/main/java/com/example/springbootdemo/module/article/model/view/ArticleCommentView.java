package com.example.springbootdemo.module.article.model.view;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Author ytq
 * @Date 2023/2/16 23:15
 */
@Data
@Builder
public class ArticleCommentView {
    private Long id;
    private Long userId;
    private String userName;
    private String commentContent;
    private Integer likeCount;
    private List<ArticleSubCommentView> subCommentViews;
    private Long createTime;
}
