package com.atguihu.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.atguihu.gulimail.member.entity.GrowthChangeHistoryEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:29:24
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

