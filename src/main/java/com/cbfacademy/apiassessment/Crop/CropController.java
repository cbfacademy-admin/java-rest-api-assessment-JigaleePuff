package com.cbfacademy.apiassessment.Crop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/crop")
public class CropController {

    private final CropService cropService;

    @Autowired
    public CropController(CropService cropService) {
        this.cropService = cropService;
    }

    @GetMapping
    public List<Crop> getCrops(){
        return cropService.getCrops();

    }

    @PostMapping
    public void registerNewCrop(@RequestBody Crop crop) {
        cropService.addNewCrop(crop);
    }

    @PutMapping(path = "{cropId}")
    public void updateCrop(
            @PathVariable("cropId") Long cropId,
            @RequestParam(required = false) Double costPerLitre,
            @RequestParam(required = false) Double purchaseWeight,
            @RequestParam(required = false) Double waterContentPerGram){
        cropService.updateCrop(cropId, costPerLitre, purchaseWeight, waterContentPerGram);
    }

    @DeleteMapping(path = "{cropId}")
    public void deleteCrop(@PathVariable("cropId") Long cropId){
        cropService.deleteCrop(cropId);
    }

}