package com.atguihu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.product.entity.AttrEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-02-25 22:29:42
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

