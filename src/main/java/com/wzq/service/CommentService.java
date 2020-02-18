package com.wzq.service;

import com.wzq.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long id);

    Comment saveComment(Comment comment);

//    void deleteCommentByBlogId(Long id);
}
