package com.cbfacademy.apiassessment.Classes;


public class WaterProduction {
  
    private Long id;

    private double sugarCaneWeight;
    private double waterProduced;
    private double aquaBotanicalWaterProduced;
    private double totalPrice;

    // Constructors

    public WaterProduction() {
        // Default constructor
    }

    public WaterProduction(
        double sugarCaneWeight,
        double waterProduced,
        double aquaBotanicalWaterProduced,
        double totalPrice
    ) {
        this.sugarCaneWeight = sugarCaneWeight;
        this.waterProduced = waterProduced;
        this.aquaBotanicalWaterProduced = aquaBotanicalWaterProduced;
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
    public double computeWaterContent() {
        // Assuming a simple calculation for water content based on sugar cane weight
        
        return sugarCaneWeight * 0.7;  // 70% water content for example
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

