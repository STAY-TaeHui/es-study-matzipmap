package com.example.matzipmap.matzip.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.matzipmap.matzip.sdo.MatzipCdo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MatzipTest
{

    @Test
    void registerMatzip()
    {
        Menu 왕양꼬치 = new Menu("왕양꼬치", 18000, "큼직한 양꼬치");
        Menu 양등심꼬치 = new Menu("양등심꼬치", 22000, "부드러운 양등심꼬치");
        Menu 탕수육 = new Menu("탕수육", 21000, "달달하고 새콤한 탕수육");

        List<Menu> menus = Arrays.asList(왕양꼬치, 양등심꼬치, 탕수육);

        MatzipCdo matzipCdo = new MatzipCdo(
            "이가네 양꼬치 교대직영점",
            "서울 서초구 반포대로22길 89 1층(서초동.서남빌딩)",
            "0212341234",
            menus,
            "이가네양꼬치 교대 직영점입니다."
        );
        Matzip matzip = matzipCdo.toDomain(matzipCdo);




    }
}