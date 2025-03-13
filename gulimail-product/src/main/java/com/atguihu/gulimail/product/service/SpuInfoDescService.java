package com.atguihu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-02-25 22:29:42
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    com.itguigu.common.utils.PageUtils queryPage(Map<String, Object> params);
}

