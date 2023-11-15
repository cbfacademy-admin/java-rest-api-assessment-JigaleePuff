package com.cbfacademy.apiassessment.Crop;

import jakarta.persistence.*;


@Entity
@Table
public class Crop {
    @Id
    @SequenceGenerator(
            name = "crop_sequence",
            sequenceName = "crop_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "crop_sequence"
    )
    private Long id;
    private String name;
    private Double waterContentPerGram;
    private Double costPerLitre;

    @Transient
    private Double cost;
    private Double numberOfAquabotanicalBottles;

    //    Null Constructor
    public Crop() {
    }

//    Constructors
    public Crop(Long id,
                String name,
                Double waterContentPerGram,
                Double costPerLitre) {
        this.id = id;
        this.name = name;
        this.waterContentPerGram = waterContentPerGram;
        this.costPerLitre = costPerLitre;
    }

    public Crop(String name, Double waterContentPerGram,
                Double costPerLitre) {
        this.name = name;
        this.waterContentPerGram = waterContentPerGram;
        this.costPerLitre = costPerLitre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWaterContentPerGram() {
        return waterContentPerGram;
    }

    public void setWaterContentPerGram(Double waterContentPerGram) {
        this.waterContentPerGram = waterContentPerGram;
    }

    public Double getCostPerLitre() {
        return costPerLitre;
    }

    public void setCostPerLitre(Double costPerLitre) {
        this.costPerLitre = costPerLitre;
    }

    public Double getCost(){
//        return waterContentPerGram * costPerLitre;
        return getWaterContentPerGram() * getCostPerLitre();
    }

    public Double getnumberOfAquabotanicalBottles(){
        return numberOfAquabotanicalBottles;
    }

    public void setNumberOfAquabotanicalBottles(Double numberOfAquabotanicalBottles) {
        this.numberOfAquabotanicalBottles =  numberOfAquabotanicalBottles;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", waterContentPerGram=" + waterContentPerGram +
                ", costPerLitre=" + costPerLitre +
                '}';
    }
}