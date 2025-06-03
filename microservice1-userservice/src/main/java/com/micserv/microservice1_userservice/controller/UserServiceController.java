package com.micserv.microservice1_userservice.controller;
import com.micserv.microservice1_userservice.model.bookinfo;
import com.micserv.microservice1_userservice.model.userlogindata;
import com.micserv.microservice1_userservice.service.loginservice;
import com.micserv.microservice1_userservice.service.signupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userservice")
public class UserServiceController {
    @Autowired
signupService sus;
    @Autowired
    loginservice lis;
    String usernamepresent;
@PostMapping("/signup")
public String signup(@RequestBody userlogindata logincred){
if (!sus.checkforDupes(logincred.getUsername() )){
    sus.addnewUser(logincred);
    return "acc created";
}else{
    return "username already exists try another";
}

}
@PostMapping("/signin")
public String login(@RequestBody userlogindata logindetails){
    if (lis.checkcred(logindetails)){
        usernamepresent=logindetails.getUsername();
        return "login successful";
    }else {
        return "wrong username or password";
    }
}

    @PostMapping("/searchbycategory/{cat}")
    public List<bookinfo> searchbycategory(@PathVariable String cat) {
        return lis.searchbycat(cat);
    }

    @PostMapping("/searchbyname/{name}")
    public bookinfo searchbyname(@PathVariable String name) {
        return lis.searchbyname(name);
    }

}
