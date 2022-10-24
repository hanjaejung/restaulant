package com.example.restaurant.wishlist.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListDto{
    //계층(Layer) 간 데이터 교환이 이루어질 수 있도록 하는 객체
    private Integer index;
    private String title;                   //음식명, 장소명
    private String category;                //카테고리
    private String address;                 //주소
    private String roadAddress;             //도로명
    private String homePageLink;            //홈페이지 주소
    private String imageLink;               //음식, 가게 이미지 주소
    private boolean isVist;                 //방문여부
    private int visitCount;                 //방문 카운트
    private LocalDateTime lastVistDate;     //마지막 방문일자

}
