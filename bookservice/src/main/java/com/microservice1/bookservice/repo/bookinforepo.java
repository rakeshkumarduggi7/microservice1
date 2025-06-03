package com.microservice1.bookservice.repo;

import com.microservice1.bookservice.model.bookinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookinforepo extends JpaRepository<bookinfo,Long> {

    @Query(value = "select * from bookinfo where bookname=:name",nativeQuery = true)
    bookinfo searchbyname(@Param("name")String name);

    @Query(value = "select * from bookinfo where category=:cat",nativeQuery = true)
    List<bookinfo> searchbycategory(@Param("cat")String cat);

}
