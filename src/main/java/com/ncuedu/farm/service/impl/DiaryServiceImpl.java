package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.DiaryMapper;
import com.ncuedu.farm.pojo.Diary;
import com.ncuedu.farm.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 20:46
 **/
@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryMapper diaryMapper;

    @Override
    public Integer insertDiary(Diary diary) {
        return diaryMapper.insertSelective(diary);
    }
}
