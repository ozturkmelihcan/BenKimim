package com.melihcan.benkimim.mapper;

import com.melihcan.benkimim.dto.request.KatilimRequestDto;
import com.melihcan.benkimim.repository.entity.Katilim;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IKatilimMapper {

    IKatilimMapper INSTANCE = Mappers.getMapper(IKatilimMapper.class);

    Katilim toKatilim(final KatilimRequestDto dto);
}
