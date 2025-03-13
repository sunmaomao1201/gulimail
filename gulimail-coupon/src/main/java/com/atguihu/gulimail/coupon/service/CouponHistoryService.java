package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.atguihu.gulimail.coupon.entity.CouponHistoryEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

