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

    @GetMapping("/")
    public ResponseEntity<String> baseEndPoint() {
        return ResponseEntity.ok("Rainbow Six Agents API - Base Endpoint");
    }

    @PostMapping("/post")
    public ResponseEntity<Object> saveAgent(@RequestBody @Valid AgentRecordDto agentRecordDto){
        return agentService.saveAgent(agentRecordDto);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<AgentModel>> getAllAgents(){
        return agentService.getAllAgents();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getAgent(@PathVariable("id") UUID id){
        return agentService.getAgentByID(id);
    }

    @PutMapping("put/{id}")
    public ResponseEntity<Object> updateAgent(@PathVariable("id") UUID uuid, @RequestBody @Valid AgentRecordDto agentRecordDto){
        return agentService.updateAgent(uuid, agentRecordDto);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Object> deleteAgent(@PathVariable("id") UUID id){
        return agentService.deleteAgent(id);
    }

}
