package com.ncuedu.farm.service;

import com.ncuedu.farm.vo.CommentCustom;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 11:14
 **/
public interface CommentCustomService {

    List<CommentCustom> queryCommentsByEssayId(Integer essayId);

    CommentCustom queryCommentByCommentId(Integer commentId);
}
