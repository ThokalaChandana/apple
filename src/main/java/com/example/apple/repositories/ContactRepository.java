package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
