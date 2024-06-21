package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.VehicleMaintainance;
@Repository

public interface VehicleMaintainanceRepository extends JpaRepository<VehicleMaintainance, Integer> {

}
