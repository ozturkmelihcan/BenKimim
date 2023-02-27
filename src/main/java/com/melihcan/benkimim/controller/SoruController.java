package com.melihcan.benkimim.controller;

import com.melihcan.benkimim.dto.request.SoruOlusturRequestDto;
import com.melihcan.benkimim.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/soru")
@RequiredArgsConstructor
public class SoruController {

    private final SoruService soruService;


    @PostMapping("/soruolustur")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String>soruOlustur(@RequestBody SoruOlusturRequestDto dto){
        soruService.soruOlustur(dto);
        return ResponseEntity.ok("soru olusturuldu");
    }


}
