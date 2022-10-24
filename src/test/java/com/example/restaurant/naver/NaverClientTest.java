package com.example.restaurant.naver;

import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void searchLocalTest(){
        //갈비집을 검색하여 결과값을 객체로 로컬값을 잘 받아오는지 테스트
        var search = new SearchLocalReq();
        search.setQuery("갈비집");

        var result = naverClient.searchLocal(search);
        System.out.println(result);
    }

    @Test
    public void searchImageTest(){
        //갈비집을 검색하여 결과값을 객체로 이미지 정보를 잘 받아오는지 테스트
        var search = new SearchImageReq();
        search.setQuery("갈비집");

        var result = naverClient.searchImage(search);
        System.out.println(result);
    }
}
