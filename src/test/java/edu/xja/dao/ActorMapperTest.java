package edu.xja.dao;

import edu.xja.domain.Actor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ActorMapperTest {
    @Resource
    private ActorMapper actorMapper;
    @Test
    public void selectByPrimaryKey() {
        Actor actor=actorMapper.selectByPrimaryKey(Integer.valueOf("1"));
        Assert.assertEquals("张三",actor.getActorName());
    }
}