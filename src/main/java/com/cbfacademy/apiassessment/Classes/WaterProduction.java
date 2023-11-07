package com.cbfacademy.apiassessment.Classes;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WaterProduction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double sugarCaneWeight;
    private double waterProduced;
    private double aquaBotanicalWaterProduced;
    private double annualWaterProduction;
    private double waterProductionPercentage;
    private double totalPrice;

    public WaterProduction save(WaterProduction waterProduction) {
        return null; // Implement your logic here
    }

    // Getters and setters

    // Constructors

    // Additional fields, constructors, and methods as needed
}
