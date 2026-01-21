package co.HMSDev.Config_and_FF_Service.controller;

import co.HMSDev.Config_and_FF_Service.model.RuleEntity;
import co.HMSDev.Config_and_FF_Service.repository.RuleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleController
{
    private final RuleRepository ruleRepository;

    public RuleController(RuleRepository ruleRepository)
    {
        this.ruleRepository = ruleRepository;
    }

    @GetMapping("/rules")
    public Iterable<RuleEntity> findAllRules(){
        return this.ruleRepository.findAll();
    }

    @PostMapping("/rule")
    public RuleEntity addOneRule(@RequestBody RuleEntity rule){
        return this.ruleRepository.save(rule);
    }
}
