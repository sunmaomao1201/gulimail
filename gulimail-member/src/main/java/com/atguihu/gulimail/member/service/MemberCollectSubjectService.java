package com.atguihu.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguihu.gulimail.member.entity.MemberCollectSubjectEntity;
import com.itguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:29:24
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

