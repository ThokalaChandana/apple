package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.VehicleModel;
@Repository

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
