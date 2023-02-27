package com.melihcan.benkimim.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SoruOlusturRequestDto {

    private String soruicerik;

    private String dogrucevap;

    private int puan;


}
