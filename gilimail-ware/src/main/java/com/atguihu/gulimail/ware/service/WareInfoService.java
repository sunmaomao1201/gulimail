package com.atguihu.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.ware.entity.WareInfoEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 23:07:29
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

