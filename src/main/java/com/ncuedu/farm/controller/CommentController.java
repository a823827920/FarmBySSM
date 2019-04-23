package com.ncuedu.farm.controller;

import com.ncuedu.farm.pojo.Comment;
import com.ncuedu.farm.pojo.User;
import com.ncuedu.farm.service.CommentCustomService;
import com.ncuedu.farm.service.CommentService;
import com.ncuedu.farm.vo.CommentCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 11:16
 **/
@Controller
public class CommentController {
    @Autowired
    private CommentCustomService commentCustomService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/user/comments",method = RequestMethod.GET)
    @ResponseBody
    public List<CommentCustom> queryComments(Integer essayId){
        List<CommentCustom> commentCustoms = commentCustomService.queryCommentsByEssayId(essayId);
        return commentCustoms;
    }

    @RequestMapping(value = "/user/comment",method = RequestMethod.POST)
    @ResponseBody
    public CommentCustom addComment(Comment comment, HttpSession session){
        User user =(User) session.getAttribute("user");
        Integer userId=0;
        if (user != null) {
            userId=user.getUserId();
        }else{
            return null;
        }
        comment.setUserId(userId);
        comment.setCommentDate(new Date());
        comment.setPraiseNum(0);
        Integer commentId = commentService.insertComment(comment);
        CommentCustom commentCustom = commentCustomService.queryCommentByCommentId(commentId);
        return commentCustom;
    }

    @RequestMapping(value = "/user/comment",method = RequestMethod.PUT)
    @ResponseBody
    public Integer addPraise(Comment comment){
        Integer result = commentService.updateComment(comment);
        return result;
    }
}
