package com.example.restaurant.wishlist.repository.service;

import com.example.restaurant.wishlist.entity.service.WishListService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListServiceTest {

    @Autowired
    private WishListService wishListService;

    @Test
    public void searchTest(){
        //클라이언트 테스트를 바탕으로 이미지와 로컬검색을 잘 받아오는지 테스트
        var result  = wishListService.search("갈비집");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }
}
