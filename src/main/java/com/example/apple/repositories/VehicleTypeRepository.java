package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.VehicleType;
@Repository

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
