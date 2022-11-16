package com.example.restaurant.wishlist.entity.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Data
@ToString(callSuper = true)
@Builder
@Entity//pk값을 설정해주지 않으면 오류가 생긴다
public class WishListDto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //계층(Layer) 간 데이터 교환이 이루어질 수 있도록 하는 객체
    //private Integer index;
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
