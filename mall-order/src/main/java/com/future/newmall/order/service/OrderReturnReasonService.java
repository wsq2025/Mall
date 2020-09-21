package com.future.newmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:27:37
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

