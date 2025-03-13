package com.atguihu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.product.entity.CategoryEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-02-25 22:29:42
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

