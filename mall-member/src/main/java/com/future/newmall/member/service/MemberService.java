package com.future.newmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.newmall.common.utils.PageUtils;
import com.future.newmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wsq
 * @email 673372988@qq.com
 * @date 2020-09-02 19:30:12
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

