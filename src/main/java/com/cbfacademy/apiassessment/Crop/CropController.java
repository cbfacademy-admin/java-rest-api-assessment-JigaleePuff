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

    // this should show all 3 farms and the crops
    @GetMapping 
    public List<Crop> getCrops(){
        return cropService.getCrops();

    }

    @PostMapping
    public void selectCrop(@RequestBody Crop crop) {
        // some method here that allows you to select crop from given crops
        cropService.addNewCrop(crop);
    }

    // updating the Jsonfile with newCrop + AquaBotanical Bottles
    @PutMapping(path = "{cropId}")
    public void updateCrop(
            @PathVariable("cropId") Long cropId,
            @RequestParam(required = false) Double numberOfCrop,
            @RequestParam(required = false) Double waterContentPerGram){
        cropService.updateCrop(cropId, numberOfCrop, waterContentPerGram);
    }

    // create exception handling to deal with not deleting the 3 given farms out of database
    @DeleteMapping(path = "{cropId}")
    public void deleteCrop(@PathVariable("cropId") Long cropId){
        cropService.deleteCrop(cropId);
    }

}