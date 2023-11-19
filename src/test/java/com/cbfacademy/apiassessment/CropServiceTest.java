package com.cbfacademy.apiassessment;

import com.cbfacademy.apiassessment.Crop.Crop;
import com.cbfacademy.apiassessment.Crop.CropRepository;
import com.cbfacademy.apiassessment.Crop.CropService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class CropServiceTest {

    @Mock
    private CropRepository cropRepository;
    @InjectMocks
    private CropService cropService;

    @Test
    public void testGetCrops(){
        Mockito.when(cropRepository.findAll()).thenReturn(Collections.singletonList(new Crop()));
        assertEquals(1, cropService.getCrops().size());
    }

    @Test
    public void testAddCrop(){
        Crop crop = new Crop();
        crop.setName("Mango");
        crop.setWaterContentPerGram(2.3);
        crop.setCostPerLitre(3.6);

        cropService.addNewCrop(crop);
        verify(cropRepository, Mockito.times(1)).save(crop);
    }

    @Test
    public void testUpdateCrop(){
        long cropId = 1L;
        double costPerLitre = 5.6d;
        double waterContentPerGram = 8.6d;
        double purchaseWeight = 11.5d;
        Crop crop = cropRepository.findById(cropId).orElseThrow(() -> new IllegalStateException(
                "Crop with the Id " + cropId + "not in database"
        ));

        crop.setCostPerLitre(costPerLitre);
        crop.setWaterContentPerGram(waterContentPerGram);
        crop.setPurchaseCost(purchaseWeight * crop.getCostPerLitre());

        Mockito.when(cropRepository.existsById(cropId)).thenReturn(true);
        Mockito.when(cropRepository.save(any(Crop.class))).thenReturn(crop);

        cropService.updateCrop(cropId, costPerLitre, purchaseWeight, waterContentPerGram);

        verify(cropRepository, Mockito.times(1)).save(crop);
    }


    @Test
    public void testDeleteCrop(){
        long cropId = 1L;
        cropService.deleteCrop(cropId);

        verify(cropRepository, Mockito.times(1)).deleteById(cropId);
    }
}