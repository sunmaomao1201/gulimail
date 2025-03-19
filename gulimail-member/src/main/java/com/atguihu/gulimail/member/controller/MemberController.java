package com.atguihu.gulimail.member.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguihu.gulimail.member.feign.CouponFeignService;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguihu.gulimail.member.entity.MemberEntity;
import com.atguihu.gulimail.member.service.MemberService;




/**
 * 会员
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2025-03-04 22:29:24
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    CouponFeignService couponFeignService;

    @RequestMapping("/coupon")
    public R couponMember(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("喜羊羊");
        R r = couponFeignService.memberCoupon();
        return R.ok().put("member", memberEntity).put("coupon", r.get("coupon"));
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
