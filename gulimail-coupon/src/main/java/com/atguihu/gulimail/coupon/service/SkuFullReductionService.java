package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.coupon.entity.SkuFullReductionEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

