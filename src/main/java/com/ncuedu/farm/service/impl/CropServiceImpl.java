package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.CropMapper;
import com.ncuedu.farm.pojo.Crop;
import com.ncuedu.farm.service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 14:32
 **/
@Service
public class CropServiceImpl implements CropService {

    @Autowired
    private CropMapper cropMapper;

    @Override
    public Integer insertCrop(Crop crop) {
        return cropMapper.insertSelective(crop);
    }
}
