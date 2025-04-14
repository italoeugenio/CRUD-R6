package com.italo.RainbowSix.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AgentRecordDto(@NotBlank String name, @NotNull Integer speed, @NotNull Integer shield) {
}
