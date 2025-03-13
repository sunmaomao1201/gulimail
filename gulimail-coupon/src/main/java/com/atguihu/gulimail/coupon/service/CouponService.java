package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.coupon.entity.CouponEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

