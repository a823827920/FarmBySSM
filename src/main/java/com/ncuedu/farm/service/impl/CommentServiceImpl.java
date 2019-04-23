package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.CommentMapper;
import com.ncuedu.farm.pojo.Comment;
import com.ncuedu.farm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 20:38
 **/
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Integer insertComment(Comment comment) {
        commentMapper.insert(comment);
        return comment.getCommentId();
    }

    @Override
    public Integer updateComment(Comment comment) {
        return commentMapper.updateByPrimaryKeySelective(comment);
    }
}
