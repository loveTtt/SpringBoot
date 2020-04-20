package com.saas.service.impl;

import com.saas.dao.FuioTermDao;
import com.saas.entity.FuiouTerm;
import com.saas.service.FuioTermServer;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@CacheConfig(cacheNames = "c1")
public class FuioTermServieImpl implements FuioTermServer{
    @Resource
    private FuioTermDao fuioTermDao;
    @Override
    @Cacheable(value = "fuio",key = "#id")
    public FuiouTerm getByFuioTerm(Long id) {
        return fuioTermDao.getByFuioTerm(id);
    }
}
