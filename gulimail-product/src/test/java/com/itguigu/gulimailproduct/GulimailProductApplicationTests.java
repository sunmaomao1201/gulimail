package com.itguigu.gulimailproduct;

import com.atguihu.gulimail.product.GulimailProductApplication;
import com.atguihu.gulimail.product.entity.BrandEntity;
import com.atguihu.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = {GulimailProductApplication.class})
class GulimailProductApplicationTests {
@Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }

}
