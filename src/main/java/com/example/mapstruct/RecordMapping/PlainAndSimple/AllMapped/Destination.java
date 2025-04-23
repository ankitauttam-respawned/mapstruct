package com.example.mapstruct.RecordMapping.PlainAndSimple.AllMapped;

import lombok.Builder;

@Builder
public record Destination(String name, String description) {
}
