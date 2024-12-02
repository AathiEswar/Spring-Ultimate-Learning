package com.spring.advance.BusinessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{6,7,8,9,10};
    }
}
