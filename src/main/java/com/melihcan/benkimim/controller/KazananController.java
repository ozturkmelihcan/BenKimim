package com.melihcan.benkimim.controller;

import com.melihcan.benkimim.dto.request.KazananRequestDto;
import com.melihcan.benkimim.dto.request.OyuncuGirisRequestDto;
import com.melihcan.benkimim.dto.response.OyuncuFindAllResponseDto;
import com.melihcan.benkimim.service.KazananService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kazanan")
@RequiredArgsConstructor
public class KazananController {

    private final KazananService kazananService;


   @PostMapping("/kazananibul")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> kazanan(@RequestBody KazananRequestDto dto){
       kazananService.kazanan(dto);
       return ResponseEntity.ok("");
   }

}
