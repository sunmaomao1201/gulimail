package com.itguigu.gulimailcoupon;

import com.atguihu.gulimail.coupon.GulimailCouponApplication;
import com.atguihu.gulimail.coupon.entity.CouponEntity;
import com.atguihu.gulimail.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GulimailCouponApplication.class)
class GulimailCouponApplicationTests {
@Autowired
private CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("test");
        couponService.save(couponEntity);
    }

}
