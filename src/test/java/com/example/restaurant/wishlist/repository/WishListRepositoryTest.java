package com.example.restaurant.wishlist.repository;

import com.example.restaurant.wishlist.entity.WishListEntity;
import com.example.restaurant.wishlist.entity.repository.WishListRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListRepositoryTest {

    @Autowired
    private WishListRepository wishListRepository;
    //DB CRUD 테스트
    @Test
    public WishListEntity create(){
        var wishList = new WishListEntity();
        wishList.setTitle("title");
        wishList.setCategory("category");
        wishList.setAddress("address");
        wishList.setRoadAddress("readAddress");
        wishList.setHomePageLink("");
        wishList.setImageLink("");
        wishList.setVist(false);
        wishList.setVisitCount(0);
        wishList.setLastVistDate(null);

        return wishList;
    }

    @Test
    public void saveTest(){
        var wishListEntity = create();
        var expected = wishListRepository.save(wishListEntity);

        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1, expected.getId());
    }

    @Test
    public void updateTest(){
        var wishListEntity = create();
        var expected = wishListRepository.save(wishListEntity);

        expected.setTitle("update test");
        var saveEntity = wishListRepository.save(expected);

        Assertions.assertEquals("update test", expected.getTitle());
        Assertions.assertEquals(1, wishListRepository.findAll().size());
        System.out.println("to-be : " + wishListRepository.findAll().get(0));
    }

    @Test
    public void findByIdTest(){
        var wishListEntity = create();
        wishListRepository.save(wishListEntity);

        var expected = wishListRepository.findById(1L);

        Assertions.assertEquals(true, expected.isPresent());
        Assertions.assertEquals(1, expected.get().getId());
    }

    @Test
    public void deleteTest(){
        var wishListEntity = create();
        wishListRepository.save(wishListEntity);
        wishListRepository.deleteById(1L);

        int count = wishListRepository.findAll().size();

        Assertions.assertEquals(0,count);
    }

    @Test
    public void listAllTest(){
        var wishListEntity1 = create();
        wishListRepository.save(wishListEntity1);

        var wishListEntity2 = create();
        wishListRepository.save(wishListEntity2);

        int count = wishListRepository.findAll().size();

        Assertions.assertEquals(2,count);
    }

}
