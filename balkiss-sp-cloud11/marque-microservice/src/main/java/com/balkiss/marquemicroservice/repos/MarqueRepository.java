package com.balkiss.marquemicroservice.repos;

import com.balkiss.marquemicroservice.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque,
        Long> {
    Marque findByMarqCode (String code);
}

