package com.melihcan.benkimim.mapper;

import com.melihcan.benkimim.dto.request.SoruOlusturRequestDto;
import com.melihcan.benkimim.repository.entity.Soru;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISoruMapper {

    ISoruMapper INSTANCE = Mappers.getMapper(ISoruMapper.class);

    Soru toSoru(final SoruOlusturRequestDto dto);
}
