package com.saas.service;
import com.saas.entity.HfnsTerm;
import org.springframework.stereotype.Service;

import	java.util.List;

public interface HfnsTermService {
    List<HfnsTerm> getHfnsTerm();

    Long getCount();
    HfnsTerm getByHfnsTerm(Long id);
}
