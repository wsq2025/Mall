package com.future.newmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:24:11
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

