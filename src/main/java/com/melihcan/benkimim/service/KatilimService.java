package com.melihcan.benkimim.service;

import com.melihcan.benkimim.dto.request.KatilimRequestDto;
import com.melihcan.benkimim.mapper.IKatilimMapper;
import com.melihcan.benkimim.repository.IKatilimRepository;
import com.melihcan.benkimim.repository.entity.Katilim;
import com.melihcan.benkimim.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class KatilimService extends ServiceManager<Katilim,Long> {

    private final IKatilimRepository katilimRepository;

    public KatilimService(IKatilimRepository katilimRepository){
        super(katilimRepository);
        this.katilimRepository=katilimRepository;
    }

    public void katilimciEkle(KatilimRequestDto dto) {
        save(IKatilimMapper.INSTANCE.toKatilim(dto));
    }
}
