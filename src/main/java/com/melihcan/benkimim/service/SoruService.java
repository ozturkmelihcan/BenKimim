package com.melihcan.benkimim.service;

import com.melihcan.benkimim.dto.request.SoruOlusturRequestDto;
import com.melihcan.benkimim.mapper.ISoruMapper;
import com.melihcan.benkimim.repository.ISoruRepository;
import com.melihcan.benkimim.repository.entity.Soru;
import com.melihcan.benkimim.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SoruService extends ServiceManager<Soru,Long> {

    private final ISoruRepository soruRepository;

    public SoruService(ISoruRepository soruRepository){
        super(soruRepository);
        this.soruRepository=soruRepository;
    }

    public void soruOlustur(SoruOlusturRequestDto dto) {
        Soru soru = ISoruMapper.INSTANCE.toSoru(dto);
        Optional<Soru>sorular = soruRepository.findOptionalBySoruicerik(dto.getSoruicerik());
        if (sorular.isEmpty()){
            save(soru);
        }
    }
}
