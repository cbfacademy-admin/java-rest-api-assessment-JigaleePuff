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
    public void addNewCrop(Crop crop) {
        Optional<Crop> cropByName = cropRepository
                .findCropByName(crop.getName());
        if (cropByName.isPresent()){
            throw new IllegalStateException("Crop already present");
        }
        cropRepository.save(crop);
        System.out.println(crop);
    }

    public void deleteCrop(Long cropId) {
        boolean present = cropRepository.existsById(cropId);
        if (!present) {
            throw new IllegalStateException(
                    "Crop with id " + cropId + "does not exists"
            );
        }
        cropRepository.deleteById(cropId);

    }

    @Transactional
    public void updateCrop(Long cropId, Double costPerLitre, Double purchaseWeight, Double waterContentPerGram) {
        Crop crop = cropRepository.findById(cropId).orElseThrow(() -> new IllegalStateException(
                "Crop with the Id " + cropId + "not in database"
        ));

        if (waterContentPerGram != null &&
        !Objects.equals(crop.getWaterContentPerGram(), waterContentPerGram)){
            crop.setWaterContentPerGram(waterContentPerGram);
        }

        if (costPerLitre != null &&
                !Objects.equals(crop.getCostPerLitre(), costPerLitre)){
            crop.setCostPerLitre(costPerLitre);
        }

        crop.setPurchaseCost(purchaseWeight * crop.getCost());
    }
}
