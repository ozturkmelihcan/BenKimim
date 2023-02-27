package com.melihcan.benkimim.mapper;

import com.melihcan.benkimim.dto.request.KazananRequestDto;
import com.melihcan.benkimim.repository.entity.Kazanan;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IKazananMapper {

    IKazananMapper INSTANCE = Mappers.getMapper(IKazananMapper.class);

    Kazanan toKazanan(final KazananRequestDto dto);
}
