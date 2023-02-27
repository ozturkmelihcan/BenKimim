package com.melihcan.benkimim.repository;

import com.melihcan.benkimim.repository.entity.Katilim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKatilimRepository extends JpaRepository<Katilim,Long> {
}
