package com.atguihu.gulimail.order.dao;

import com.atguihu.gulimail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:25
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
