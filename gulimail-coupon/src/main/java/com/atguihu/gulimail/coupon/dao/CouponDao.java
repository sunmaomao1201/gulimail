package com.atguihu.gulimail.coupon.dao;

import com.atguihu.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
