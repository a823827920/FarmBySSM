package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Cate;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 15:47
 **/
public interface CateService {

    Integer insertCate(Cate cate);

    List<Cate> querySecondCates();

    List<Cate> queryCateByPid(Integer pid);

}
