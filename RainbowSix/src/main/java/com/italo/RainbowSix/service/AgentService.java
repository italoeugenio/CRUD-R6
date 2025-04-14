package com.italo.RainbowSix.service;

import com.italo.RainbowSix.dto.AgentRecordDto;
import com.italo.RainbowSix.model.AgentModel;
import com.italo.RainbowSix.repository.AgentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AgentService {
    @Autowired
    private AgentRepository agentRepository;

    public ResponseEntity<?> saveAgent(@RequestBody @Valid AgentRecordDto agentRecordDto){
        List<AgentModel> list = agentRepository.findAll();
        for(AgentModel agents:list){
            if(agentRecordDto.name().equals(agents.getName())){
                return ResponseEntity.status(HttpStatus.CONFLICT)
                        .body("The agent already exist");
            }
        }
        if((agentRecordDto.speed() < 1 || agentRecordDto.speed() > 3) || (agentRecordDto.shield() < 1 || agentRecordDto.shield() > 3)){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY)
                    .body("Speed and shield values must be between 1-3");
        }else if((agentRecordDto.shield() + agentRecordDto.speed() != 4)){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY)
                    .body
                    ("The sum of shield and speed need be 4");
        }
        var agentModel = new AgentModel();
        BeanUtils.copyProperties(agentRecordDto,agentModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(agentRepository.save(agentModel));
    }

    public ResponseEntity<List<AgentModel>> getAllAgents(){
        return ResponseEntity.status(HttpStatus.OK).body(agentRepository.findAll());
    }

    public ResponseEntity<?> getAgentByID(UUID id){
        Optional<AgentModel> agentModel = agentRepository.findById(id);
        if(agentModel.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(agentModel);
    }

}
