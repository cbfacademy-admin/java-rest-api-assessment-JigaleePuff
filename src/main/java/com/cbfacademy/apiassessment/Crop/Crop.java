package com.cbfacademy.apiassessment.Crop;


import jakarta.persistence.*;

@Entity
@Table
public class Crop {
    @Id
    @SequenceGenerator(name = "crop_sequence", sequenceName = "crop_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "crop_sequence")
    private Long id;
    private String name;
    private Double waterContentPerGram;
    private Double numberOfAquabotanicalBottles;
    private Double numberOfCrop;
    private String siteName;



    // Null Constructor
    public Crop(String string, String string2, double d) {
    }

    // Constructors
    public Crop(Long id,
            String name,
            Double waterContentPerGram) {
        this.id = id;
        this.name = name;
        this.waterContentPerGram = waterContentPerGram;

    }

    public Crop(String name, Double waterContentPerGram, Double setNumberOfAquabotanicalBottles) {
        this.name = name;
        this.waterContentPerGram = waterContentPerGram;
        this.numberOfAquabotanicalBottles = setNumberOfAquabotanicalBottles;

    }

    public Crop(String string, Object object) {
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

    public void setsiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getsiteName(){
        return siteName;
        
    }

      // Add this method to get site name by crop name

      public String getSiteNameByCropName(String cropName) {
        // Assuming you have some logic to map crop names to site names
        if ("Tomatoes".equalsIgnoreCase(cropName)) {
            return "Your Site Name for Tomatoes";
        } else if ("YourOtherCrop".equalsIgnoreCase(cropName)) {
            return "Your Site Name for YourOtherCrop";
        } else {
            // Handle other cases or throw an exception
            throw new IllegalArgumentException("Unknown crop name: " + cropName);
        }
    }


    public void setNumberOfCrop(Double numberOfCrop) {
        this.numberOfCrop = numberOfCrop;
    }

    public void getNumberOfCrop(Double numberOfCrop) {
        this.numberOfCrop = numberOfCrop;
    }

    public Double getWaterContentPerGram() {
        return waterContentPerGram;
    }

    public void setWaterContentPerGram(Double waterContentPerGram) {
        this.waterContentPerGram = waterContentPerGram;
    }

    public Double getnumberOfAquabotanicalBottles() {
        return numberOfAquabotanicalBottles;
    }

    public void setNumberOfAquabotanicalBottles(Double numberOfAquabotanicalBottles) {
        this.numberOfAquabotanicalBottles = numberOfAquabotanicalBottles;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", waterContentPerGram=" + waterContentPerGram +
                '}';
    }



    public Object getFarm() {
        return null;
    }

    public Object getnumberOfCrop() {
        return null;
    }

}