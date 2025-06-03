package com.micserv.microservice1_userservice.service;

import com.micserv.microservice1_userservice.client.bookserviceclient;
import com.micserv.microservice1_userservice.model.bookinfo;
import com.micserv.microservice1_userservice.model.userlogindata;
import com.micserv.microservice1_userservice.repository.userloginrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginservice {
    @Autowired
    userloginrepo ulr;
@Autowired
    bookserviceclient bsc;
    public boolean checkcred(userlogindata ld){

        if ( ulr.getdatails(ld.getUsername()) ==null)return false;
        else if ( ulr.getdatails(ld.getUsername()) .getPassword().equals(ld.getPassword())){
                return true;
            }else return false;
    }
    public bookinfo searchbyname(String book){
   return bsc.searchbyname(book);
    }
    public List<bookinfo> searchbycat(String cat){
        return bsc.searchbycategory(cat);
    }
}
