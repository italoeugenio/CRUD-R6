package com.italo.RainbowSix.dto;

import com.italo.RainbowSix.model.AgentModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Optional;

public record AgentRecordDto(@NotBlank String name, @NotNull Integer speed, @NotNull Integer shield) {

}
