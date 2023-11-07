package com.cbfacademy.apiassessment.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.cbfacademy.apiassessment.Classes.WaterProduction;
import com.cbfacademy.apiassessment.Services.WaterProductionService;


// Get all the data in the database
@RestController
@RequestMapping("/water-production")
public class WaterProductionController {
    private final WaterProductionService waterProductionService;

    public WaterProductionController(WaterProductionService waterProductionService) {
        this.waterProductionService = waterProductionService;
    }


    
    @PostMapping("/calculate")
    public WaterProductionDTO calculateWaterProduction(@RequestBody WaterProductionDTO waterProductionDTO) {
        // Call the service method to perform calculations or database operations
        return waterProductionService.calculateWaterProduction(waterProductionDTO);
        }
        
      
       
    
}
 



// }
// @GetMapping("/all")
// public List<WaterProduction> getAll() {
//     return null;
// }
// @PutMapping("/update/{id}")
// public WaterProductionDTO updateWaterProduction(@PathVariable Long id, @RequestBody WaterProductionDTO waterProductionDTO) {
//     // Implement your logic to update data by ID
// }
// @DeleteMapping("/delete/{id}")
// public void deleteWaterProduction(@PathVariable Long id) {
//     // Implement your logic to delete data by ID
