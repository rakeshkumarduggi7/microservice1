package com.micserv.microservice1_userservice.client;

import com.micserv.microservice1_userservice.model.bookinfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("book-service")
public interface bookserviceclient {

//    @PostMapping("/bookservice/addbooks")
//    public String addbooks(@RequestBody List<bookinfo> books);

    @GetMapping("/bookservice/searchbyname/{name}")
    public bookinfo searchbyname(@PathVariable String name);
    @GetMapping("/bookservice/searchbycategory/{cat}")
    public List<bookinfo> searchbycategory(@PathVariable String cat);

//    @PostMapping("/bookservice/addtocart")
//    public String addbookstocart(@RequestParam String book,@RequestParam String username);
//
//    @GetMapping("/bookservice/getbooksincart")
//    public List<String> getbooksincart(@RequestParam String username);

}
