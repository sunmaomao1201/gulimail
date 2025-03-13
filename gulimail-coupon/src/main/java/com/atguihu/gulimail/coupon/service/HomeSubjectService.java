package com.atguihu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.atguihu.gulimail.coupon.entity.HomeSubjectEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 21:51:25
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

