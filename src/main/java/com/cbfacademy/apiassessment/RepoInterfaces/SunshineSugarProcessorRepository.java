package com.cbfacademy.apiassessment.RepoInterfaces;

import org.springframework.data.repository.CrudRepository;
import com.cbfacademy.apiassessment.Classes.SunshineSugarProcessor;

public interface SunshineSugarProcessorRepository extends CrudRepository<SunshineSugarProcessor, Long> {
    // You can add custom query methods if needed
}

