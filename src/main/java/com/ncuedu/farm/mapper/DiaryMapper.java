package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Diary;
import com.ncuedu.farm.pojo.DiaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiaryMapper {
    long countByExample(DiaryExample example);

    int deleteByExample(DiaryExample example);

    int deleteByPrimaryKey(Integer diaryId);

    int insert(Diary record);

    int insertSelective(Diary record);

    List<Diary> selectByExample(DiaryExample example);

    Diary selectByPrimaryKey(Integer diaryId);

    int updateByExampleSelective(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByExample(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByPrimaryKeySelective(Diary record);

    int updateByPrimaryKey(Diary record);
}