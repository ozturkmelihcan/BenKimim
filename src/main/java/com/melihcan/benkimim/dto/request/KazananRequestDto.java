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
public class KazananRequestDto {

    Long id;

    String oyuncucevabi;

    Long soruid;

    Long oyuncuid;

}
