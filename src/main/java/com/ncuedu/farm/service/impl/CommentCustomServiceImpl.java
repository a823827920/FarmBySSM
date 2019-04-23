package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.CommentCustomMapper;
import com.ncuedu.farm.service.CommentCustomService;
import com.ncuedu.farm.vo.CommentCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 11:15
 **/
@Service
public class CommentCustomServiceImpl implements CommentCustomService {

    @Autowired
    private CommentCustomMapper commentCustomMapper;

    @Override
    public List<CommentCustom> queryCommentsByEssayId(Integer essayId) {
        return commentCustomMapper.selectCommentByEssayId(1);
    }

    @Override
    public CommentCustom queryCommentByCommentId(Integer commentId) {
        return commentCustomMapper.selectCommentCustomByCommentId(commentId);
    }
}
