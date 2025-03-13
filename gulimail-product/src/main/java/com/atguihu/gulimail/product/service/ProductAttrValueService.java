package com.atguihu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-02-25 22:29:42
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    com.itguigu.common.utils.PageUtils queryPage(Map<String, Object> params);
}

