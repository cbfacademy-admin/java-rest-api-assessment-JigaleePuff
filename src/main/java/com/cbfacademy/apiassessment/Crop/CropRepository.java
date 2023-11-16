package com.cbfacademy.apiassessment.Crop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


// This implemetes inheritance from the JpaRepository
// It provides the functionality to use methods from the JpaRepository in our define Crop Repository

@Repository
public interface CropRepository
        extends JpaRepository <Crop, Long>{
    @Query
    ("SELECT c FROM Crop c WHERE c.name = ?1") // Custom query to retrieve data from SQL data base
    Optional<Crop> findCropByName(String sitename);

    List<Crop> findCropsBySiteName(String siteName);


   

}