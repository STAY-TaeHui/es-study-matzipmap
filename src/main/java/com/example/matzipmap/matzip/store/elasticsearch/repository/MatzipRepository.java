package com.example.matzipmap.matzip.store.elasticsearch.repository;

import com.example.matzipmap.matzip.domain.Matzip;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MatzipRepository extends ElasticsearchRepository<Matzip, Long>
{

}
