package com.example.matzipmap.matzip.store.elasticsearch.doc;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Menu
{
    private String name;
    private int price;
    private String introduce;
}
