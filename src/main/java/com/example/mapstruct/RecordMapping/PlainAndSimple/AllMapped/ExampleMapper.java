package com.example.mapstruct.RecordMapping.PlainAndSimple.AllMapped;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ExampleMapper {
    ExampleMapper INSTANCE = Mappers.getMapper(ExampleMapper.class);
    Source destinationToSource(Destination destination);
    Destination sourceToDestination(Source source);
}
