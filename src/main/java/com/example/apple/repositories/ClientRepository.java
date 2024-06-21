package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
