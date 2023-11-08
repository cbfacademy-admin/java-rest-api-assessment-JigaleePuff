package com.cbfacademy.apiassessment.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfacademy.apiassessment.Classes.Crop;
import com.cbfacademy.apiassessment.RepoInterfaces.CropRepository;

@Service
public class CropService {
    @Autowired
    private CropRepository cropRepository;

    // Add other service methods as needed

    public Crop saveCrop(Crop crop) {
        return cropRepository.save(crop);
    }
    @Autowired
    public CropService(CropRepository cropRepository) {
        this.cropRepository = cropRepository;
    }

   


    // Additional service methods for managing crops
}