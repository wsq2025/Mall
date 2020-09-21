package com.future.newmall.member.feign;

import com.future.newmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/Member/list")
    public R Membercoupons();
}
