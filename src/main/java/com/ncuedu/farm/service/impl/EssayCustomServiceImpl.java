package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.EssayCustomMapper;
import com.ncuedu.farm.service.EssayCustomService;
import com.ncuedu.farm.vo.EssayCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 10:27
 **/
@Service
public class EssayCustomServiceImpl implements EssayCustomService {

    @Autowired
    private EssayCustomMapper essayCustomMapper;

    @Override
    public EssayCustom queryEssayById(Integer id) {
        return essayCustomMapper.selectEssayById(id);
    }

    @Override
    public List<EssayCustom> queryEssays() {
        return essayCustomMapper.selectEssays();
    }
}
