package com.example.springbootdemo.module.article.model.view;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Author ytq
 * @Date 2023/2/16 23:18
 */
@Data
@Builder
public class ArticleSubCommentView {
    private Long id;
    private Long fromUserId;
    private String fromUserName;
    private Long toUserId;
    private String toUserName;
    private String commentContent;
    private Integer likeCount;
    private Long createTime;
}
