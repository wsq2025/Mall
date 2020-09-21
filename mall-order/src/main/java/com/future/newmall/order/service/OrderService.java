package com.future.newmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:27:37
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    String GetIdBySnowFlake();
}

