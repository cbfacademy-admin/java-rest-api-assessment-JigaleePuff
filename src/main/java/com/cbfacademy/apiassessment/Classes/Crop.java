package com.cbfacademy.apiassessment.Classes;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Crop implements Serializable {
   
    private Long id;
    private String name;
    private double waterContent;

    // Constructors, getters, and setters
}
