package com.atguihu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-02-25 22:29:42
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    com.itguigu.common.utils.PageUtils queryPage(Map<String, Object> params);
}

