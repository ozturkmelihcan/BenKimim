package com.melihcan.benkimim.repository;

import com.melihcan.benkimim.repository.entity.Oyun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOyunRepository extends JpaRepository<Oyun,Long> {
}
