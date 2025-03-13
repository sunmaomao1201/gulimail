package com.atguihu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-02-25 22:29:42
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    com.itguigu.common.utils.PageUtils queryPage(Map<String, Object> params);
}

