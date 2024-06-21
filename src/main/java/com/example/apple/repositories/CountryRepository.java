package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
