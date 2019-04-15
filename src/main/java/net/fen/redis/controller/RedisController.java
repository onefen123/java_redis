package net.fen.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/add")
    public void add(){
        stringRedisTemplate.opsForValue().set("name1","lwf1");
        stringRedisTemplate.opsForValue().set("name2","lwf2");
        stringRedisTemplate.opsForValue().set("name3","lwf3");
        System.out.println();
    }
    @GetMapping("/get")
    public void get(){
        stringRedisTemplate.opsForValue().get("name");
        System.out.println(stringRedisTemplate.opsForValue().get("name"));
    }

}
