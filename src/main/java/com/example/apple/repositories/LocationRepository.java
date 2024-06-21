package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.Location;
@Repository

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
