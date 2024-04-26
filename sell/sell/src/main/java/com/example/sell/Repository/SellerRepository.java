package com.example.sell.Repository;

import com.example.sell.Entiity.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<SellerEntity, String> {
    // You can define custom query methods here if needed
}
