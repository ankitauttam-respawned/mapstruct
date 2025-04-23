package com.example.mapstruct.RecordMapping.PlainAndSimple.AllMapped;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExampleMapperTest {

    private final ExampleMapper mapper = ExampleMapper.INSTANCE;

    @Test
    void generatedDestinationShouldBeSameAsSource() {
        Source subject = Source.builder().name("Test").description("SimpleObject").build();
        Destination result = mapper.sourceToDestination(subject);
        assertThat(result).isNotNull();
        assertEquals("Test", result.name());
        assertEquals("SimpleObject", result.description());
    }

    @Test
    void generatedSourceShouldBeSameAsDestination() {
        Destination d = Destination.builder().name("Test").description("SimpleObject").build();
        Source result = mapper.destinationToSource(d);
        assertThat(result).isNotNull();
        assertEquals("Test", result.name());
        assertEquals("SimpleObject", result.description());
    }
}