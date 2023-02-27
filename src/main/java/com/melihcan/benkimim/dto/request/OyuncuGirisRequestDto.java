package com.melihcan.benkimim.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OyuncuGirisRequestDto {

    private String username;

    private String password;

    private boolean state;

}
