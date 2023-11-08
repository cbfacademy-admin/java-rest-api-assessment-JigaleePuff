package com.cbfacademy.apiassessment.RepoInterfaces;

import org.springframework.data.repository.CrudRepository;
import com.cbfacademy.apiassessment.Classes.WaterProduction;

public interface WaterProductionRepository extends CrudRepository<WaterProduction, Long> {
    // You can add custom query methods if needed
}
