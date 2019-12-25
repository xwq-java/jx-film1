package edu.xja.dao;

import edu.xja.domain.Actor;

public interface ActorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Actor record);

    int insertSelective(Actor record);

    Actor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}