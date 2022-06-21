package com.example.thymeleafcrud2bang.service;

import com.example.thymeleafcrud2bang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IGeneralService<T>{
    Iterable<T> findAll();

    Page<T> findAll(Pageable pageable);

    Optional<T> findById(int id);

    T save(T t);

    void remove(int id);

    Iterable<T>findAllByNameContaining(String name);

    @Query(value = "select * from post order by id desc LIMIT 4", nativeQuery = true)
    Iterable<T> getTop4New();
    @Query(value = "select * from post where likes > 6",nativeQuery = true)
    Iterable<T> getLikes();
}
