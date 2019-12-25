package edu.xja.controller;

import edu.xja.domain.Actor;
import edu.xja.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/jx-film")
public class ActorController {
    @Resource
    private ActorService actorService;
    @GetMapping("/{id}")
    public Actor selectByPrimaryKey(@PathVariable  Integer id) {
        return actorService.selectByPrimaryKey(id);
    }
}
