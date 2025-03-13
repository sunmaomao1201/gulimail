package com.atguihu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.order.entity.OrderEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 订单
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:25
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

