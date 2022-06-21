package com.example.thymeleafcrud2bang.repository;

import com.example.thymeleafcrud2bang.model.Customer;
import com.example.thymeleafcrud2bang.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {
  Page<Province> findAll(Pageable pageable);

  Iterable<Customer>findAllByNameContaining(String name);
}
