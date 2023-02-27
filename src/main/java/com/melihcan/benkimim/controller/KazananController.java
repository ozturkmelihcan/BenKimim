package com.melihcan.benkimim.controller;

import com.melihcan.benkimim.dto.request.KazananRequestDto;
import com.melihcan.benkimim.dto.request.OyuncuGirisRequestDto;
import com.melihcan.benkimim.dto.response.OyuncuFindAllResponseDto;
import com.melihcan.benkimim.service.KazananService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.melihcan.benkimim.constants.RestEndPoints.*;
import java.util.List;

@RestController
@RequestMapping(KAZANAN)
@RequiredArgsConstructor
public class KazananController {

    private final KazananService kazananService;


   @PostMapping(KAZANANIBUL)
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> kazanan(@RequestBody KazananRequestDto dto){
       kazananService.kazanan(dto);
       return ResponseEntity.ok("");
   }

}
