package com.italo.RainbowSix.controller;

import com.italo.RainbowSix.dto.AgentRecordDto;
import com.italo.RainbowSix.model.AgentModel;
import com.italo.RainbowSix.service.AgentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/post")
    public ResponseEntity<?> saveAgent(@RequestBody @Valid AgentRecordDto agentRecordDto){
        return agentService.saveAgent(agentRecordDto);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<AgentModel>> getAllAgents(){
        return agentService.getAllAgents();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getAgent(@PathVariable("id") UUID id){
        return agentService.getAgentByID(id);
    }
}
