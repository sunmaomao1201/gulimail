package com.atguihu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.product.entity.AttrAttrgroupRelationEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-02-25 22:29:42
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

