package com.cbfacademy.apiassessment.Controllers;

import org.springframework.web.bind.annotation.*;

import com.cbfacademy.apiassessment.Services.CropService;

@RestController
@RequestMapping("/crop")
public class CropController {
    private final CropService cropService;

    public CropController(CropService cropService) {
        this.cropService = cropService;
    }

    // Define your endpoints and methods here
}

