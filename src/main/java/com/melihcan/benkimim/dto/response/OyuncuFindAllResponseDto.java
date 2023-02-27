package com.melihcan.benkimim.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OyuncuFindAllResponseDto {

    private String ad;

    private Long id;

    private int hak;
}
