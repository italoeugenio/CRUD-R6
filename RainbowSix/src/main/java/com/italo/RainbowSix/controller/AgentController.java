package com.italo.RainbowSix.controller;

import com.italo.RainbowSix.dto.AgentRecordDto;
import com.italo.RainbowSix.service.AgentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/post")
    public ResponseEntity<?> saveAgent(@RequestBody @Valid AgentRecordDto agentRecordDto){
        return agentService.saveAgent(agentRecordDto);
    }
}
