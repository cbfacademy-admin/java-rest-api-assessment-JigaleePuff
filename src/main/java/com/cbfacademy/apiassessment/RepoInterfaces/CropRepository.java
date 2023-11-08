package com.cbfacademy.apiassessment.RepoInterfaces;
import org.springframework.data.repository.CrudRepository;

import com.cbfacademy.apiassessment.Classes.Crop;


public interface CropRepository extends CrudRepository<Crop, Long> {
    // You can add custom query methods if needed
}
