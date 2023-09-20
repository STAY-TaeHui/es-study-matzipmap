package com.example.matzipmap.matzip.domain.store;

import java.util.List;

import com.example.matzipmap.matzip.domain.Matzip;

public interface MatzipStore
{
    List<Matzip> findAll();
    Matzip findById();
    Long registerMatzip(Matzip matzip);
    int updateMatzip(Matzip matzip);
}
