package com.melihcan.benkimim.controller;

import com.melihcan.benkimim.dto.request.OyuncuGirisRequestDto;
import com.melihcan.benkimim.dto.request.OyuncuUyeOlRequestDto;
import com.melihcan.benkimim.dto.response.OyuncuFindAllResponseDto;
import com.melihcan.benkimim.repository.entity.Oyuncu;
import com.melihcan.benkimim.service.OyuncuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.melihcan.benkimim.constants.RestEndPoints.*;

import java.util.List;

@RestController
@RequestMapping(OYUNCU)
@RequiredArgsConstructor
public class OyuncuController {

    private final OyuncuService oyuncuService;

    @PostMapping(UYEOL)
    @CrossOrigin(origins = "*")
    public ResponseEntity<OyuncuUyeOlRequestDto> oyuncuOlustur(@RequestBody OyuncuUyeOlRequestDto dto){
        oyuncuService.uyeOl(dto);
        return ResponseEntity.ok(OyuncuUyeOlRequestDto.builder().state(true).build());
    }

    @PostMapping("/girisyap")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Boolean> girisYap(@RequestBody OyuncuGirisRequestDto dto){
        return ResponseEntity.ok(oyuncuService.girisYap(dto));

    }

    @PostMapping("/findall")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<OyuncuFindAllResponseDto>>findAll(){
        return ResponseEntity.ok(oyuncuService.findAllResponseDtos());
    }

    @GetMapping("findbyad")
    public ResponseEntity<List<Oyuncu>>findByAd(String ad){

        return ResponseEntity.ok(oyuncuService.adinaGoreGetir(ad));
    }
}
