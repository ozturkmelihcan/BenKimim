package com.melihcan.benkimim.mapper;

import com.melihcan.benkimim.dto.request.OyuncuUyeOlRequestDto;
import com.melihcan.benkimim.dto.response.OyuncuFindAllResponseDto;
import com.melihcan.benkimim.repository.entity.Oyuncu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IOyuncuMapper {

    IOyuncuMapper INSTANCE = Mappers.getMapper(IOyuncuMapper.class);

    Oyuncu toOyuncu(final OyuncuUyeOlRequestDto dto);

    OyuncuFindAllResponseDto oyuncuFindAllResponseDtoFromOyuncu(final Oyuncu oyuncu);

}
