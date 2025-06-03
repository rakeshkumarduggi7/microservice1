package com.microservice1.bookservice.service;

import com.microservice1.bookservice.model.bookinfo;
import com.microservice1.bookservice.model.userandcart;
import com.microservice1.bookservice.repo.bookinforepo;
import com.microservice1.bookservice.repo.userandcartrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookservice {
    @Autowired
    bookinforepo bookrepo;

    @Autowired
    userandcartrepo uac;
    public void addbooks(List<bookinfo> books){
        bookrepo.saveAll(books);
    }

    public bookinfo searchbyname(String name){
         return bookrepo.searchbyname(name);
    }

    public List<bookinfo> searchbycategory(String cat) {
       return bookrepo.searchbycategory(cat);
    }

    public void addtocart(String book,String username){
         userandcart uaco=new userandcart();
         uaco.setBook(book);uaco.setUsername(username);
         uac.save(uaco);
    }

    public List<String> getbooksincartbyun(String username){
        return uac.booksincartbyun(username);
    }
}
