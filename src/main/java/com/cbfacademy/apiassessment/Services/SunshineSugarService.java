package com.cbfacademy.apiassessment.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbfacademy.apiassessment.Classes.SunshineSugarProcessor;
import com.cbfacademy.apiassessment.RepoInterfaces.SunshineSugarProcessorRepository;

@Service
public class SunshineSugarService {
    private final SunshineSugarProcessorRepository processorRepository;

    public SunshineSugarService(SunshineSugarProcessorRepository processorRepository) {
    this.processorRepository = processorRepository;
    }

    public SunshineSugarProcessor saveProcessor(SunshineSugarProcessor processor) {
        return processorRepository.save(processor);
    }

    // Add other service methods as needed
}
