package com.cbfacademy.apiassessment.Controllers;

import org.springframework.web.bind.annotation.*;
import com.cbfacademy.apiassessment.Services.SunshineSugarService;

@RestController
@RequestMapping("/sugar-processor")
public class SunshineSugarController {
    private final SunshineSugarService processorService;

    public SunshineSugarController(SunshineSugarService processorService) {
        this.processorService = processorService;
    }

    // Define your endpoints and methods here
}
