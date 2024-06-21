package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.VehicleMovement;
@Repository

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
