package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.VehicleStatus;
@Repository

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
