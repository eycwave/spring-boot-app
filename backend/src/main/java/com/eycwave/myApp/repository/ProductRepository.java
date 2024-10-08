package com.eycwave.myApp.repository;

import com.eycwave.myApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByUuid(String uuid);

    boolean existsByUuid(String productUuid);
}
