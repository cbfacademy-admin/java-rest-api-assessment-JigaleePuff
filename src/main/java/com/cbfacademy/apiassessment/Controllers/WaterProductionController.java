package com.cbfacademy.apiassessment.Controllers;

import org.springframework.web.bind.annotation.*;

import com.cbfacademy.apiassessment.Classes.WaterProduction;
import com.cbfacademy.apiassessment.DTOFiles.WaterProductionDTO;
import com.cbfacademy.apiassessment.Services.WaterProductionService;

@RestController
@RequestMapping("/water-production")
public class WaterProductionController {
    private final WaterProductionService waterProductionService;

    @GetMapping("/retrieve-data")
    public WaterProductionController(WaterProductionService waterProductionService) {
        this.waterProductionService = waterProductionService;
    }

    @PostMapping("/calculate")
    public WaterProductionDTO calculateWaterProduction(@RequestBody WaterProductionDTO waterProductionDTO) {
        WaterProduction waterProduction = new WaterProduction(
            waterProductionDTO.getSugarCaneWeight(),
            waterProductionDTO.getWaterProduced(),
            waterProductionDTO.getAquaBotanicalWaterProduced(),
            waterProductionDTO.getTotalPrice()
        );
       
    

        double waterContent = waterProduction.computeWaterContent();
        // Use waterContent as needed, you can include it in WaterProductionDTO or return separately

         return waterProductionDTO;
         // Return the result or update WaterProductionDTO accordingly
    }
}

        


    // Define other endpoints as needed


 




