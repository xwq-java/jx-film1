package edu.xja.service.impl;

import edu.xja.dao.ActorMapper;
import edu.xja.domain.Actor;
import edu.xja.service.ActorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ActorServiceImpl implements ActorService {
    @Resource
    private ActorMapper actorMapper;
    @Override
    public Actor selectByPrimaryKey(Integer id) {
        return actorMapper.selectByPrimaryKey(id);
    }
}
