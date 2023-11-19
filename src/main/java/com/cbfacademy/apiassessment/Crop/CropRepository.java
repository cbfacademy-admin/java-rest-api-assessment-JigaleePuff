package com.cbfacademy.apiassessment.Crop;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CropRepository
        extends JpaRepository <Crop, Long>{
    @Query("SELECT c FROM Crop c WHERE c.name = ?1")
    Optional<Crop> findCropByName(String name);
}