package com.future.newmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:32:29
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

