package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

//品牌接口
public interface BrandService {
    public List<TbBrand> findAll();
    //品牌分页
    public PageResult findPage(int pageNum,int pageSize);
    //增加品牌
    public void add(TbBrand brand);
    //根据id查询品牌
    public TbBrand findOne(Long id);
    //修改
    public void update(TbBrand brand);
    //删除
    public void delete(Long[] ids);
    //查询
    public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
}
