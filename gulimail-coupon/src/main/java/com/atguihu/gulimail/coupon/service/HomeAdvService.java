package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.atguihu.gulimail.coupon.entity.HomeAdvEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

