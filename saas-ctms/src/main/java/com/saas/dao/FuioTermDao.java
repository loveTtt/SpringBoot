package com.saas.dao;
import	java.util.Queue;

import com.saas.entity.FuiouTerm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FuioTermDao extends JpaRepository<FuiouTerm,Long> {
    @Query("select f from FuiouTerm f where id =:id")
    FuiouTerm getByFuioTerm(Long id);
}
