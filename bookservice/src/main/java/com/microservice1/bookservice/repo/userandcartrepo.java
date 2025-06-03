package com.microservice1.bookservice.repo;

import com.microservice1.bookservice.model.userandcart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userandcartrepo extends JpaRepository<userandcart,Long> {

@Query(value = "select book from userandcart where username=:un",nativeQuery = true)
    List<String> booksincartbyun(@Param("un")String un);
}
