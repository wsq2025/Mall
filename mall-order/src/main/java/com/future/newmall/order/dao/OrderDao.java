package com.future.newmall.order.dao;

import com.future.newmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:27:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
