package com.itguigu.gulimailmember;

import com.atguihu.gulimail.member.GulimailMemberApplication;
import com.atguihu.gulimail.member.entity.GrowthChangeHistoryEntity;
import com.atguihu.gulimail.member.service.GrowthChangeHistoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GulimailMemberApplication.class)
class GulimailMemberApplicationTests {
@Autowired
private GrowthChangeHistoryService growthChangeHistoryService;
    @Test
    void contextLoads() {
        GrowthChangeHistoryEntity growthChangeHistoryEntity = new GrowthChangeHistoryEntity();
        growthChangeHistoryEntity.setNote("123");
        growthChangeHistoryService.save(growthChangeHistoryEntity);
    }

}
