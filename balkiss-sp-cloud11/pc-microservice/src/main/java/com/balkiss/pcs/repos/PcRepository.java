package com.balkiss.pcs.repos;


import com.balkiss.pcs.entities.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends JpaRepository<Pc, Long> {
}
