package com.atguihu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.order.entity.OrderReturnApplyEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:25
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

