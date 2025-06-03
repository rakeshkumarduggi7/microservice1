package com.micserv.microservice1_userservice.service;
import com.micserv.microservice1_userservice.model.userlogindata;
import com.micserv.microservice1_userservice.repository.userloginrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class signupService {
    @Autowired
    userloginrepo ulr;

    public boolean checkforDupes(String username){
if (ulr.checkforusername(username)==0){
    return false;
}else return true;
    }
    public void addnewUser(userlogindata logincred) {
        ulr.save(logincred);
    }
}
