package com.demo.demo.data.repository;

import com.demo.demo.data.entitie.Billionaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillionaireRepository extends JpaRepository<Billionaire, Integer> {
}
