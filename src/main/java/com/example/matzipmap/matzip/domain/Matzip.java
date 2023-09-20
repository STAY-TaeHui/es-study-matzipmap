package com.example.matzipmap.matzip.domain;

import java.util.List;

import com.example.matzipmap.matzip.sdo.MatzipCdo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * 맛집 도메인
 *
 * - 이름
 * - 위치
 * - 메뉴
 * - 소개
 * */
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Matzip
{
    private Long id;
    private String title;
    private String address;
    private String call;
    private List<Menu> menu;
    private String introduce;

    public Matzip(String title, String address, String call, List<Menu> menu, String introduce)
    {
        this.title = title;
        this.address = address;
        this.call = call;
        this.menu.addAll(menu);
        this.introduce = introduce;
    }
}
