package com.cbfacademy.apiassessment.Crop;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CropService {
    private final CropRepository cropRepository;

    @Autowired
    public CropService(CropRepository cropRepository) {
        this.cropRepository = cropRepository;
    }
    public List<Crop> getCrops(){
        return cropRepository.findAll();
    }


    // This method handles the exceptions of entering a crop name that is already one of the 3 farms

    public void selectCrop(Crop crop) {
        Optional<Crop> cropByName = cropRepository
                .findCropByName(crop.getName());
        if (cropByName.isPresent()){
            throw new IllegalStateException("Crop already present");
        }
        cropRepository.save(crop);
        System.out.println(crop);
    }

    // Delete operation of the CRUD operations to delete item by id from the data base

    public void deleteCrop(Long cropId) {
        boolean present = cropRepository.existsById(cropId);
        if (!present) {
            throw new IllegalStateException(
                    "Crop with id " + cropId + "does not exists"
            );
        }
        cropRepository.deleteById(cropId);
    }
// this method you will be able to call the Crop name by its site name and vice versa
    



    public List<Crop> getCropsBySiteName(String siteName) {
        return cropRepository.findCropsBySiteName(siteName);
    }


    // Algorithm to implement the computation of water yield from crop to bottles of water
    
    @Transactional
    public void updateCrop(Long cropId, Double numberOfCrop, Double waterContentPerGram) {
        Crop crop = cropRepository.findById(cropId).orElseThrow(() -> new IllegalStateException(
                "Crop with the Id " + cropId + "not in database"
        ));

        if (waterContentPerGram != null &&
        !Objects.equals(crop.getWaterContentPerGram(), waterContentPerGram)){
            crop.setWaterContentPerGram(waterContentPerGram);
        }

        if (numberOfCrop != null &&
                !Objects.equals(crop.getnumberOfCrop(), cropId)){
            crop.getnumberOfCrop();
        }

        crop.setNumberOfAquabotanicalBottles(numberOfCrop * crop.getWaterContentPerGram());
    }
    public void addNewCrop(Crop crop) {
    }
}