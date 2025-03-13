package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.atguihu.gulimail.coupon.entity.SkuLadderEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

