package com.cbfacademy.apiassessment.Services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cbfacademy.apiassessment.Classes.WaterProduction;
import com.google.gson.Gson;

@Service
public class WaterProductionService {

    private final String jsonFilePath = "src/main/resources/Data/WaterProductionData.json";
    private final Gson gson = new Gson();

    public List<WaterProduction> getAllProducts() {
        List<WaterProduction> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.jsonFilePath))) {
      
         String line;

            while ((line = bufferedReader.readLine()) != null) {
                WaterProduction product = gson.fromJson(line, WaterProduction.class);
                if (product != null) {
                    products.add(product);
                }
            }
        } catch (IOException e) {
            System.out.println();
            // Handle the exception, e.g., log an error or return an empty list.
        }
        return products;
    }

    public void saveProducts(List<WaterProduction> products) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(jsonFilePath, false))) {
            for (WaterProduction product : products) {
                String productJson = gson.toJson(product);
                bufferedWriter.write(productJson);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception, e.g., log an error or throw a custom exception.
        }
    }
}


// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.List;
// import java.util.stream.Collectors;

// // ...

// public List<WaterProduction> getAllProducts() {
//     try {
//         List<String> lines = Files.readAllLines(Paths.get(jsonFilePath));
//         return lines.stream()
//             .map(line -> gson.fromJson(line, WaterProduction.class))
//             .filter(product -> product != null)
//             .collect(Collectors.toList());
//     } catch (IOException e) {
//         // Handle the exception, e.g., log an error or return an empty list.
//         return Collections.emptyList();
//     }
// }









// package com.cbfacademy.apiassessment.Services;

// import org.springframework.stereotype.Service;
// import com.cbfacademy.apiassessment.Classes.WaterProduction;
// import com.cbfacademy.apiassessment.DTOFiles.WaterProductionDTO;
// import com.cbfacademy.apiassessment.Repositories.WaterProductionRepository;

// @Service
// public class WaterProductionService {
//     private final WaterProductionService waterProductionRepository;

//     public WaterProductionService(WaterProductionService waterProductionRepository) {
//         this.waterProductionRepository = waterProductionRepository;
//     }

//     public WaterProduction saveWaterProduction(WaterProduction waterProduction) {
//         return waterProductionRepository.save(waterProduction);
//     }

//     public WaterProductionDTO calculateWaterProduction(WaterProductionDTO waterProductionDTO2) {
//         WaterProductionDTO waterProductionDTO = new WaterProductionDTO();

//         // Implement the logic to calculate water production here
//         // For example:
//         double sugarCaneWeight = waterProductionDTO2.getSugarCaneWeight();
//         double waterProduced = sugarCaneWeight * 0.1; // Example calculation
//         waterProductionDTO.setSugarCaneWeight(sugarCaneWeight);
//         waterProductionDTO.setWaterProduced(waterProduced);

//         // You can perform database operations, calculations, and other business logic
//         // Replace with the actual calculation and data storage

//         return waterProductionDTO;
//     }

//     public WaterProductionDTO calculateWaterProduction(WaterProductionDTO waterProductionDTO) {
//         return null;
//     }

//     // Add other service methods as needed
// }