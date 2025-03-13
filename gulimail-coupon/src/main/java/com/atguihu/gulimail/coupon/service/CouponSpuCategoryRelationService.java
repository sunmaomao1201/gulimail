package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.coupon.entity.CouponSpuCategoryRelationEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

