package com.atguihu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.order.entity.RefundInfoEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 退款信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:24
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

