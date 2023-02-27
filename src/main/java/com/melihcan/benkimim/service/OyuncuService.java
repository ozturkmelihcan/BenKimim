package com.melihcan.benkimim.service;

import com.melihcan.benkimim.dto.request.OyuncuGirisRequestDto;
import com.melihcan.benkimim.dto.request.OyuncuUyeOlRequestDto;
import com.melihcan.benkimim.dto.response.OyuncuFindAllResponseDto;
import com.melihcan.benkimim.mapper.IOyuncuMapper;
import com.melihcan.benkimim.repository.IOyuncuRepository;
import com.melihcan.benkimim.repository.entity.Oyuncu;
import com.melihcan.benkimim.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OyuncuService extends ServiceManager<Oyuncu,Long> {

    private final IOyuncuRepository oyuncuRepository;

    public OyuncuService(IOyuncuRepository oyuncuRepository){
        super(oyuncuRepository);
        this.oyuncuRepository=oyuncuRepository;
    }

    public void uyeOl(OyuncuUyeOlRequestDto dto) {
        Oyuncu oyuncu = IOyuncuMapper.INSTANCE.toOyuncu(dto);
        Optional<Oyuncu>oyuncu1 = oyuncuRepository.findOptionalByUsernameAndPassword(dto.getUsername(),dto.getPassword());
        if (oyuncu1.isEmpty()){
            oyuncu.setHak(5);
            save(oyuncu);
        }
    }

    public Boolean girisYap(OyuncuGirisRequestDto dto){
        Optional<Oyuncu> oyuncu = oyuncuRepository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if (oyuncu.isPresent()){
            return true;
        }
        return false;
    }


    public List<OyuncuFindAllResponseDto> findAllResponseDtos() {
        List<OyuncuFindAllResponseDto>result = new ArrayList<>();
        findAll().forEach(x->{
            result.add(IOyuncuMapper.INSTANCE.oyuncuFindAllResponseDtoFromOyuncu(x));
        });
        return result;
    }


    public List<Oyuncu> adinaGoreGetir(String oyuncuad) {
        return oyuncuRepository.findByAd(oyuncuad);
    }
}
