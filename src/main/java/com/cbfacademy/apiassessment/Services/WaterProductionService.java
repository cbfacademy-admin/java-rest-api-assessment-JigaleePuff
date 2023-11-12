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
        //another name for "products" this case meaning the data in waterproduction.json

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

// now im calling the compute water content to get the amount of aquabotanical waters produced, updated json file


package com.cbfacademy.apiassessment.Services;

import com.cbfacademy.apiassessment.Classes.WaterProduction;
import com.cbfacademy.apiassessment.RepoInterfaces.WaterProductionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterProductionService implements WaterProductionRepository {

    private final String jsonFilePath = "src/main/resources/Data/WaterProductionData.json";
    private final Gson gson = new Gson();

    @Override
    public List<WaterProduction> computeWaterContent(double weight) {
        List<WaterProduction> waterProductions = getAllProducts();

        // Perform the computation for water content based on the provided weight
        for (WaterProduction waterProduction : waterProductions) {
            double waterContent = waterProduction.getSugarCaneWeight() * 0.7;  // Example calculation
            waterProduction.setWaterProduced(waterContent);
        }

        // You can return the modified list or update the database as needed
        return waterProductions;
    }

    // Other methods as needed

    // Existing methods like getAllProducts and saveProducts
    // ...
}









