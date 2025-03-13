package com.atguihu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.order.entity.OrderReturnReasonEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 退货原因
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:25
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

