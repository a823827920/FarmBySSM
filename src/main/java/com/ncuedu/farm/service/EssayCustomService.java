package com.ncuedu.farm.service;

import com.ncuedu.farm.vo.EssayCustom;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 10:26
 **/
public interface EssayCustomService {

    EssayCustom queryEssayById(Integer id);

    List<EssayCustom> queryEssays();
}
