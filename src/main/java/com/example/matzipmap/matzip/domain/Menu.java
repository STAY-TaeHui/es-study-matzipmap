package com.example.matzipmap.matzip.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
* 메뉴
* - 이름
* - 가격
* - 소개
* */
@Getter
@AllArgsConstructor
public class Menu
{
    private String name;
    private int price;
    private String introduce;

}
