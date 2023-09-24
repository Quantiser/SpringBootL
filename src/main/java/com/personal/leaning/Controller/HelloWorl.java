package com.personal.leaning.Controller;

import com.personal.leaning.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorl {
    @GetMapping("{id}")
    public  String pathhVariable(@PathVariable String id,
                                 @PathVariable(value = "id2", required = false) String name){
        return "Path Vairable is "+id +" name is this "+name;
    }

    @RequestMapping(value="/helo")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("getuser")
    public  User user(){
        User user = new User();
        user.setUserName("Me");
        user.setId("1");
        user.setEmailId("Juchbhi");
        return user;
    }

    @GetMapping("{idk}/{name}")
    public String requestMapping( @PathVariable String idk,
                                  @PathVariable(value = "name",required = false) String name,
                                  @RequestParam(value = "id",defaultValue = "",required = false)String id,
                                  @RequestParam(value = "yeBhi",defaultValue = "", required = true)String yeBhi)
                                {
            return idk+name+id+yeBhi;
    }




}
