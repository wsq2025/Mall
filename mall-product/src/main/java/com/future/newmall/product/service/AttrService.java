package com.future.newmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:24:11
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

