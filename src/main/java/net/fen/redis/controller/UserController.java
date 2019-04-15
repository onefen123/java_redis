package net.fen.redis.controller;

import net.fen.redis.entity.User;
import net.fen.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register",method={RequestMethod.GET,RequestMethod.POST})
    public Integer register(User user, Model model) {
        return userService.add(user);
    }

    @RequestMapping(value = "/selectUsers",method={RequestMethod.GET,RequestMethod.POST})
    public List<User> selectUsers() {
        return userService.selectUsers();
    }
}
