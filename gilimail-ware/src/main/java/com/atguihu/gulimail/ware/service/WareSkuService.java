package com.atguihu.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.ware.entity.WareSkuEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品库存
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 23:07:29
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

