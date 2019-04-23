package com.ncuedu.farm.mapper;

import com.ncuedu.farm.vo.CommentCustom;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 11:07
 **/
public interface CommentCustomMapper {

    List<CommentCustom> selectCommentByEssayId(Integer essayId);

    CommentCustom selectCommentCustomByCommentId(Integer commentId);
}
