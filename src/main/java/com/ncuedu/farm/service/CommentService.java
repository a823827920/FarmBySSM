package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Comment;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 11:06
 **/
public interface CommentService {

    Integer insertComment(Comment comment);

    Integer updateComment(Comment comment);
}
