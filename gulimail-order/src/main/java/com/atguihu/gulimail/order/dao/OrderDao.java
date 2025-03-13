package com.atguihu.gulimail.order.dao;

import com.atguihu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
