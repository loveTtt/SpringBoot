package com.saas.dao;
import com.saas.entity.HfnsTerm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import	java.util.List;
public interface HfnsTermDao extends JpaRepository<HfnsTerm,Long> {
    @Query("select h from HfnsTerm h where id =:id")
    HfnsTerm getByHfnsTerm(Long id);
}
