package com.future.newmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:32:29
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

