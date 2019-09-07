package com.example.flowablecaseswithprocesses.controllers;

import org.flowable.cmmn.api.CmmnRuntimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartCaseController {

    private final CmmnRuntimeService cmmnRuntimeService;

    public StartCaseController(CmmnRuntimeService cmmnRuntimeService) {
        this.cmmnRuntimeService = cmmnRuntimeService;
    }

    @GetMapping("/")
    public String startCase(){
        cmmnRuntimeService.createCaseInstanceBuilder()
                .caseDefinitionKey("triggerMultipleServicesCase")
                .start();

        return "Started";
    }
}
