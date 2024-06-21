package com.example.apple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apple.model.InvoiceStatus;
@Repository

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
