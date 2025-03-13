package com.atguihu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.order.entity.PaymentInfoEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:25
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

