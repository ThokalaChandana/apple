package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.VehicleMake;
@Repository

public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
