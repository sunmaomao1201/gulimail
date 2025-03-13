package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.coupon.entity.SeckillSkuNoticeEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

