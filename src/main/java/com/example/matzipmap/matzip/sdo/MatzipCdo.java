package com.example.matzipmap.matzip.sdo;

import java.util.List;

import com.example.matzipmap.matzip.domain.Matzip;
import com.example.matzipmap.matzip.domain.Menu;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MatzipCdo
{
    private String title;
    private String address;
    private String call;
    private List<Menu> menu;
    private String introduce;

    public Matzip toDomain(MatzipCdo cdo){
        return new Matzip(
            cdo.getTitle(),
            cdo.getAddress(),
            cdo.getCall(),
            cdo.getMenu(),
            cdo.getIntroduce()
        );
    }

}
