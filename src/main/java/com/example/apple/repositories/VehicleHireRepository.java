package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.VehicalHire;
@Repository

public interface VehicleHireRepository extends JpaRepository<VehicalHire, Integer> {

}
