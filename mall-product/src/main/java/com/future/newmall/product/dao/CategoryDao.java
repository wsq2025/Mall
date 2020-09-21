package com.future.newmall.product.dao;

import com.future.newmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:24:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
