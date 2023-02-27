package com.melihcan.benkimim.controller;

import com.melihcan.benkimim.dto.request.KatilimRequestDto;
import com.melihcan.benkimim.service.KatilimService;
import com.melihcan.benkimim.service.KazananService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/katilim")
@RequiredArgsConstructor
public class KatilimController {

    private final KatilimService katilimService;

    @PostMapping("/katilimci")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> katilimciekle(@RequestBody KatilimRequestDto dto){
        katilimService.katilimciEkle(dto);
        return ResponseEntity.ok("oyuncu katildi");
    }
}
