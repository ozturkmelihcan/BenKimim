package com.melihcan.benkimim.repository;

import com.melihcan.benkimim.repository.entity.Kazanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKazananRepository extends JpaRepository<Kazanan,Long> {
}
