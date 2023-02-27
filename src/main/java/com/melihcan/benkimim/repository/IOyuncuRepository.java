package com.melihcan.benkimim.repository;

import com.melihcan.benkimim.repository.entity.Oyuncu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IOyuncuRepository extends JpaRepository<Oyuncu,Long> {
    Optional<Oyuncu> findOptionalByUsernameAndPassword(String username,String password);


    List<Oyuncu> findByAd(String oyuncuad);
}
