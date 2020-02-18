package com.wzq.dao;

import com.wzq.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

//    @Query("delete from Comment c where c.blog.id = ?1")
//    void deleteCommentsByBlogId(Long blogId);
}
