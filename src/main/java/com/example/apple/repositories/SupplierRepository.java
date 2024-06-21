package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.Supplier;
@Repository

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
