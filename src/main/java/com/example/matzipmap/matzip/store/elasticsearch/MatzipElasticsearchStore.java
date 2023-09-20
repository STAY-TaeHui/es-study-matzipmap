package com.example.matzipmap.matzip.store.elasticsearch;

import java.util.List;

import com.example.matzipmap.matzip.domain.Matzip;
import com.example.matzipmap.matzip.domain.store.MatzipStore;

public class MatzipElasticsearchStore implements MatzipStore
{

    @Override
    public List<Matzip> findAll()
    {
        return null;
    }

    @Override
    public Matzip findById()
    {
        return null;
    }

    @Override
    public Long registerMatzip(Matzip matzip)
    {
        return null;
    }

    @Override
    public int updateMatzip(Matzip matzip)
    {
        return 0;
    }
}
