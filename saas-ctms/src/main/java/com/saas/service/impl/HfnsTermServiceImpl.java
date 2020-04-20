package com.saas.service.impl;

import com.saas.dao.HfnsTermDao;
import com.saas.entity.HfnsTerm;
import com.saas.service.HfnsTermService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@CacheConfig(cacheNames = "c1")
public class HfnsTermServiceImpl implements HfnsTermService {
    @Resource
    private HfnsTermDao hfnsTermDao;

    @Override
    @Cacheable(value = "hfns1",key ="#getHfnsTerm")
    public List<HfnsTerm> getHfnsTerm() {
        return hfnsTermDao.findAll();
    }

    @Override
    public Long getCount() {
        return hfnsTermDao.count();
    }

    @Override
    @Cacheable(value = "hfns" , key = "#id")
    public HfnsTerm getByHfnsTerm(Long id) {
        return hfnsTermDao.getByHfnsTerm(id);
    }
}
