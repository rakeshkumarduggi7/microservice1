package com.microservice1.bookservice.controller;

import com.microservice1.bookservice.model.bookinfo;
import com.microservice1.bookservice.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookservice")
public class bookservicecontroller {
    @Autowired
    bookservice bookserv;
    @PostMapping("/addbooks")
    public String addbooks(@RequestBody List<bookinfo> books){
        bookserv.addbooks(books);
        return "added books";
    }

    @GetMapping("/searchbyname/{name}")
    public bookinfo searchbyname(@PathVariable String name){
        return bookserv.searchbyname(name);
    }
    @GetMapping("/searchbycategory/{cat}")
    public List<bookinfo> searchbycategory(@PathVariable String cat){
        return bookserv.searchbycategory(cat);
    }

//    @PostMapping("/addtocart")
//    public String addbookstocart(@RequestParam String book,@RequestParam String username){
//bookserv.addtocart(book,username);
//return "success";
//    }
//
//    @GetMapping("/getbooksincart")
//    public List<String> getbooksincart(@RequestParam String username){
//return bookserv.getbooksincartbyun(username);
//    }

}
