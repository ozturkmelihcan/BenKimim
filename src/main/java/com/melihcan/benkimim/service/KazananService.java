package com.melihcan.benkimim.service;

import com.melihcan.benkimim.dto.request.KazananRequestDto;
import com.melihcan.benkimim.dto.request.OyuncuGirisRequestDto;
import com.melihcan.benkimim.dto.response.OyuncuFindAllResponseDto;
import com.melihcan.benkimim.exception.BenKimimException;
import com.melihcan.benkimim.exception.ErrorType;
import com.melihcan.benkimim.mapper.IKazananMapper;
import com.melihcan.benkimim.mapper.IOyuncuMapper;
import com.melihcan.benkimim.repository.IKazananRepository;
import com.melihcan.benkimim.repository.IOyuncuRepository;
import com.melihcan.benkimim.repository.entity.Kazanan;
import com.melihcan.benkimim.repository.entity.Oyuncu;
import com.melihcan.benkimim.repository.entity.Soru;
import com.melihcan.benkimim.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KazananService extends ServiceManager<Kazanan,Long> {

    private final IKazananRepository kazananRepository;

    private final OyuncuService oyuncuService;
    private final SoruService soruService;

    public KazananService(IKazananRepository kazananRepository,OyuncuService oyuncuService,SoruService soruService) {
        super(kazananRepository);
        this.kazananRepository=kazananRepository;
        this.oyuncuService=oyuncuService;
        this.soruService=soruService;
    }


    public void kazanan(KazananRequestDto dto) {
        Kazanan kazanan = new Kazanan();
        Oyuncu oyuncu = oyuncuService.findById(dto.getOyuncuid()).get();
        Soru soru = soruService.findById(dto.getSoruid()).get();
        if (dto.getOyuncucevabi().equals(soru.getDogrucevap())){
            kazanan.setOyuncuid(dto.getOyuncuid());
            kazanan.setOyunid(dto.getSoruid());
            save(kazanan);
        }else {
            oyuncu.setHak(oyuncu.getHak()-1);
            oyuncuService.save(oyuncu);
        }

    }
}

