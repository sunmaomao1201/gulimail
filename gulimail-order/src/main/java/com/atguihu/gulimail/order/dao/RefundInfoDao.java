package com.atguihu.gulimail.order.dao;

import com.atguihu.gulimail.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:52:24
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
