package com.atguihu.gulimail.member.feign;

import com.itguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/menberCoupon")
    public R memberCoupon();
}
