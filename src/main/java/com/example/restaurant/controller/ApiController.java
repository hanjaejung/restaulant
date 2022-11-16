package com.example.restaurant.controller;

import com.example.restaurant.wishlist.entity.dto.WishListDto;
import com.example.restaurant.wishlist.entity.service.WishListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {

    private final WishListService wishListService;

    @GetMapping("/search")
    public WishListDto search(@RequestParam String query){ //search 검색 api
        return wishListService.search(query);
    }

    @PostMapping("")
    public WishListDto add(@RequestBody WishListDto wishListDto){ //맛집 추가 api
        log.info("{}", wishListDto);
        return wishListService.add(wishListDto);
    }

    @GetMapping("/all")
    public List<WishListDto> findAll(){ //맛집 list 전체를 볼 수 있는 api
        return wishListService.findAll();
    }

    @DeleteMapping("/{index}")
    public void delete(@PathVariable Long index){ //원하는 list 하나를 삭제 하는 api
        wishListService.delete(index);
    }

    @PostMapping("/{index}")
    public void addVisit(@PathVariable Long index){ //원하는 리스트중 하나의 방문수를 올릴수 있는 api
        wishListService.addVisit(index);
    }

}
