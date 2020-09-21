package com.future.newmall.order.service.impl;

import com.future.newmall.order.entity.OrderIdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.common.utils.Query;

import com.future.newmall.order.dao.OrderDao;
import com.future.newmall.order.entity.OrderEntity;
import com.future.newmall.order.service.OrderService;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Autowired
    public OrderIdGeneratorSnowflake idGeneratorSnowflake;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderEntity> page = this.page(
                new Query<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public String GetIdBySnowFlake() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            threadPool.submit(() ->{
                System.out.println(idGeneratorSnowflake.SnowflakeId());
            });
        }
        threadPool.shutdown();
        
        return null;
    }

}