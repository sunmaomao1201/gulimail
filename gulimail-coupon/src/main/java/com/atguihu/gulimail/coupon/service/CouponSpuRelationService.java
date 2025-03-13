package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.atguihu.gulimail.coupon.entity.CouponSpuRelationEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

