// package com.cbfacademy.apiassessment.Classes;
// import java.io.Serializable;

// import jakarta.persistence.Entity;

// @Entity
// public class SunshineSugarProcessor implements Serializable {
// private static final long serialVersionUID = 1L;
//     private Long id;

//     private String name;
//     private String location;
//     private double annualWaterVolume;
//     public Long getId() {
//         return id;
//     }
//     public void setId(Long id) {
//         this.id = id;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getLocation() {
//         return location;
//     }
//     public void setLocation(String location) {
//         this.location = location;
//     }
//     public double getAnnualWaterVolume() {
//         return annualWaterVolume;
//     }
//     public void setAnnualWaterVolume(double annualWaterVolume) {
//         this.annualWaterVolume = annualWaterVolume;
//     }
//     public SunshineSugarProcessor(Long id, String name, String location, double annualWaterVolume) {
//         this.id = id;
//         this.name = name;
//         this.location = location;
//         this.annualWaterVolume = annualWaterVolume;
//     }

//     // Getters and setters

//     // Constructors

//     // Additional fields, constructors, and methods as needed
// }

package com.cbfacademy.apiassessment.Classes;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SunshineSugarProcessor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private double annualWaterVolume;

    
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {}

    // Constructors
    public SunshineSugarProcessor(){}

    // Additional fields, constructors, and methods as needed
}

