package th.ac.kmutt.sit.MySpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
  
    User[] totalUser = {new User(1,"Mr.ONE"),new User(2,"Mr.TWO"),new User(3,"Mr.THREE"),new User(4,"Mr.FOUR"),new User(5,"Mr.FIVE")};

    @GetMapping("/users")
    public User[] getAllUsers(){
        return totalUser;
    }

    @GetMapping("/user/1")
    public User getUser1(){
        return totalUser[0];
    }

    @GetMapping("/user/2")
    public User getUser2(){
        return totalUser[1];
    }

    @GetMapping("/user/3")
    public User getUser3(){
        return totalUser[2];
    }

    @GetMapping("/user/4")
    public User getUser4(){
        return totalUser[3];
    }

    @GetMapping("/user/5")
    public User getUser5(){
        return totalUser[4];
    }
}