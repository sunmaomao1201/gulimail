package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.coupon.entity.HomeSubjectSpuEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 专题商品
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

