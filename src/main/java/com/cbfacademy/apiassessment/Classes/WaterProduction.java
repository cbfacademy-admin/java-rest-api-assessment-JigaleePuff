package com.cbfacademy.apiassessment.Classes;

import jakarta.persistence.GenerationType;

@jakarta.persistence.Entity
public class WaterProduction {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double sugarCaneWeight;
    private double waterProduced;
    private double aquaBotanicalWaterProduced;
    private double annualWaterProduction;
    private double waterProductionPercentage;
    private double totalPrice;

    // Constructors

    public WaterProduction() {
        // Default constructor
    }

    public WaterProduction(
        double sugarCaneWeight,
        double waterProduced,
        double aquaBotanicalWaterProduced,
        double annualWaterProduction,
        double waterProductionPercentage,
        double totalPrice
    ) {
        this.sugarCaneWeight = sugarCaneWeight;
        this.waterProduced = waterProduced;
        this.aquaBotanicalWaterProduced = aquaBotanicalWaterProduced;
        this.annualWaterProduction = annualWaterProduction;
        this.waterProductionPercentage = waterProductionPercentage;
        this.totalPrice = totalPrice;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSugarCaneWeight() {
        return sugarCaneWeight;
    }

    public void setSugarCaneWeight(double sugarCaneWeight) {
        this.sugarCaneWeight = sugarCaneWeight;
    }

    public double getWaterProduced() {
        return waterProduced;
    }

    public void setWaterProduced(double waterProduced) {
        this.waterProduced = waterProduced;
    }

    public double getAquaBotanicalWaterProduced() {
        return aquaBotanicalWaterProduced;
    }

    public void setAquaBotanicalWaterProduced(double aquaBotanicalWaterProduced) {
        this.aquaBotanicalWaterProduced = aquaBotanicalWaterProduced;
    }

    public double getAnnualWaterProduction() {
        return annualWaterProduction;
    }

    public void setAnnualWaterProduction(double annualWaterProduction) {
        this.annualWaterProduction = annualWaterProduction;
    }

    public double getWaterProductionPercentage() {
        return waterProductionPercentage;
    }

    public void setWaterProductionPercentage(double waterProductionPercentage) {
        this.waterProductionPercentage = waterProductionPercentage;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
