package com.melihcan.benkimim.service;

import com.melihcan.benkimim.repository.IOyunRepository;
import com.melihcan.benkimim.repository.entity.Oyun;
import com.melihcan.benkimim.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OyunService extends ServiceManager<Oyun,Long> {

    private final IOyunRepository oyunRepository;

    public OyunService(IOyunRepository oyunRepository){
        super(oyunRepository);
        this.oyunRepository=oyunRepository;
    }


}
