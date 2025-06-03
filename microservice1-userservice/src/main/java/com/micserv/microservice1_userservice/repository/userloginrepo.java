package com.micserv.microservice1_userservice.repository;
import com.micserv.microservice1_userservice.model.userlogindata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface userloginrepo extends JpaRepository<userlogindata,String> {

    @Query(value = "select count(*) from userlogindata where username= :un",nativeQuery = true)
  int checkforusername(@Param("un")String un);

    @Query(value = "select * from userlogindata where username=:un",nativeQuery = true)
    userlogindata getdatails(@Param("un")String un);
}
