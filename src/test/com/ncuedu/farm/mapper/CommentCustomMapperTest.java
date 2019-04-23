package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Essay;
import com.ncuedu.farm.vo.CommentCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 13:19
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContextService.xml", "file:src/main/webapp/WEB-INF/applicationContextDao.xml"})
public class CommentCustomMapperTest {

    @Autowired
    private CommentCustomMapper commentCustomMapper;

    @Test
    public void testSelectCommentByEssayid(){
        List<CommentCustom> commentCustoms = commentCustomMapper.selectCommentByEssayId(1);
        System.out.println(commentCustoms);
    }

    @Test
    public void testSelectCommentByCommentid(){
        CommentCustom commentCustom = commentCustomMapper.selectCommentCustomByCommentId(1);
        System.out.println(commentCustom);
    }




}
