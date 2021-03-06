package com.future.newmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 17:21:54
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

