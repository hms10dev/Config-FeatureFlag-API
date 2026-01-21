package co.HMSDev.Config_and_FF_Service.controller;

import co.HMSDev.Config_and_FF_Service.model.FlagEntity;
import co.HMSDev.Config_and_FF_Service.repository.FlagRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlagController
{
    private final FlagRepository flagRepository;

    public FlagController(FlagRepository flagRepository)
    {
        this.flagRepository = flagRepository;
    }

    @GetMapping("/flags")
    public Iterable<FlagEntity> findAllFlags(){
        return this.flagRepository.findAll();
    }

    @PostMapping("/flags")
    public FlagEntity addOneFlag(@RequestBody FlagEntity flag){
        return this.flagRepository.save(flag);
    }

}
