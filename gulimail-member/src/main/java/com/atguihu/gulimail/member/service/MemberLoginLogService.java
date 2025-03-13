package com.atguihu.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.member.entity.MemberLoginLogEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:29:24
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

