package com.spring.advance.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {
    public DataService dataService ;
    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
