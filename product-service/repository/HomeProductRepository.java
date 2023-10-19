package com.example.productservice.Stas.repository;

import com.example.productservice.Stas.entity.HomeProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomeProductRepository extends JpaRepository<HomeProductEntity, Long> {
}
