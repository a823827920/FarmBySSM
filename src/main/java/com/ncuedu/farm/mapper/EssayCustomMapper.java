package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Essay;
import com.ncuedu.farm.vo.EssayCustom;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 10:16
 **/
public interface EssayCustomMapper {

    EssayCustom selectEssayById(Integer id);

    List<EssayCustom> selectEssays();
}
