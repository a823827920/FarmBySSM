package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.CateMapper;
import com.ncuedu.farm.pojo.Cate;
import com.ncuedu.farm.pojo.CateExample;
import com.ncuedu.farm.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 15:48
 **/
@Service
public class CateServiceImpl implements CateService {

    @Autowired
    private CateMapper cateMapper;

    @Override
    public Integer insertCate(Cate cate) {
        return cateMapper.insertSelective(cate);
    }

    @Override
    public List<Cate> querySecondCates() {
        CateExample cateExample=new CateExample();
        CateExample.Criteria criteria = cateExample.createCriteria();
        criteria.andParentIdNotEqualTo(0);
        return cateMapper.selectByExample(cateExample);
    }

    @Override
    public List<Cate> queryCateByPid(Integer pid) {
        CateExample cateExample = new CateExample();
        CateExample.Criteria criteria = cateExample.createCriteria();
        criteria.andParentIdEqualTo(pid);
        List<Cate> cates = cateMapper.selectByExample(cateExample);
        return cates;
    }


}
