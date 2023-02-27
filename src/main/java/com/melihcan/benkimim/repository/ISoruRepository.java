package com.melihcan.benkimim.repository;

import com.melihcan.benkimim.repository.entity.Soru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISoruRepository extends JpaRepository<Soru,Long> {
    Optional<Soru> findOptionalBySoruicerik(String soruicerik);


}
